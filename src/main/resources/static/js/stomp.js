var socket = new SockJS('/ws');
var stompClient = Stomp.over(socket);

stompClient.connect({}, function(frame) {
	console.log('Connected: ' + frame);

	// Subscribe to topic
	stompClient.subscribe('/topic/greeting', function(message) {
		console.log("Raw message: ", message);
		const body = JSON.parse(message.body);
		const msgDiv = document.getElementById('messages'); // Use correct div for output
		console.log("Message received: ", body.content);
		msgDiv.innerHTML += `<p style="padding: 3px; margin: 5px;">Message received: ${body.content}</p>`;
	});
});

function sendMessage() {
	const inputField = document.getElementById('fname');
	const messageContent = inputField.value.trim(); // Get input value and trim spaces

	if (messageContent) {
		stompClient.send('/app/hello', {}, JSON.stringify({ name: messageContent }));
		inputField.value = ""; // Clear input after sending
	} else {
		console.log("Cannot send an empty message");
	}
}
