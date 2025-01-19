const StompJs = require('@stomp/stompjs');
const WebSocket = require('ws'); // Import WebSocket implementation

// Configure the STOMP client
const client = new StompJs.Client({
	brokerURL: 'ws://localhost:9012/ws', // WebSocket URL
	webSocketFactory: () => new WebSocket('ws://localhost:9012/ws'), // Provide WebSocket implementation
	debug: function(str) {
		console.log(str); // Log debug information
	},
	reconnectDelay: 5000, // Reconnect after 5 seconds if the connection is lost
});

// Handle successful connection
client.onConnect = function(frame) {
	console.log('Connected:', frame);

	// Subscribe to the topic
	client.subscribe('/topic/greeting', function(message) {
		console.log('Received:', JSON.parse(message.body)); // Log received messages
	});

	// Send a message to the server
	client.publish({
		destination: '/app/hello', // Server-side mapping in GreetingController
		body: JSON.stringify({ name: 'Test User' }), // Replace 'Test User' with your desired name
	});
};

// Handle errors
client.onStompError = function(frame) {
	console.error('Broker reported error:', frame.headers['message']);
	console.error('Details:', frame.body);
};

// Activate the client
client.activate();
