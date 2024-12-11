// Establish WebSocket connection
var socket = new SockJS('/ws');
var stompClient = Stomp.over(socket);

stompClient.connect({}, function(frame) {
	console.log('Connected: ' + frame);

	// Subscribe to a topic
	stompClient.subscribe('/topic/messages', function(message) {
		console.log(JSON.parse(message.body).content);
	});

	// Send a message to the server
	stompClient.send('/app/chat', {}, JSON.stringify({ 'content': 'Hello World!' }));
});

