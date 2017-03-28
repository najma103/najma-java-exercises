$(document).ready(function () {
	var socket = new SockJS('ws-connect');
	var connection = Stomp.over(socket);
	
	var handleChat = function(message) {
		var messageObject = JSON.parse(message.body);
		var pTag = $('<p>').addClass('message');
		
		var userSpan = $('<span>').addClass('username').text(messageObject.userName);
		pTag.append(userSpan);
		
		var hours = messageObject.sentDate.hour;
		var amPm = hours >= 12 ? 'PM' : 'AM';
		if(hours > 12) {
			hours = hours - 12;
		}
		
		var timeSpan = $('<span>').addClass('time').text(hours + ':' + messageObject.sentDate.minute + ' ' + amPm);
		pTag.append(timeSpan);
		pTag.append($('<br>'));
		pTag.append(messageObject.message);
		
		$('#history').append(pTag);
	};
	
	var handleUser = function(member) {
		var userArray = JSON.parse(member.body);
		
		$('#members ul').empty();
		
		for(var i = 0; i < userArray.length; i++) {
			var item = $('<li>').text(userArray[i]);
			$('#members ul').append(item);
		}
	};
	
	var errorCallback = function(error) {
		console.log(error);
	};
	
	var successCallback = function(frame) {
		console.log("Connected: " + frame);
		
		connection.subscribe('/topic/members', handleUser);
		connection.subscribe('/topic/chat', handleChat);
	};
	
	connection.connect({}, successCallback, errorCallback);
	
	$('#newMessageForm button').on('click', function(event) {
		var message = {
			message: $('#newMessageForm textarea').val()
		};
		
		console.log("Sending: " + message);
		
		connection.send('/app/chat', {}, JSON.stringify(message));
		
		$('#newMessageForm textarea').val('');
		
		return false;
	});
});



















