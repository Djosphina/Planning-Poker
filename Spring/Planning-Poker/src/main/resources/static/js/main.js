'use strict';

var usernamePage = document.querySelector('#username-page');
var chatPage = document.querySelector('#chat-page');
var usernameForm = document.querySelector('#usernameForm');
var messageForm = document.querySelector('#messageForm');
var messageInput = document.querySelector('#message');
var messageArea = document.querySelector('#messageArea');
var connectingElement = document.querySelector('.connecting');

var stompClient = null;
var username = null;

var colors = [
    '#2196F3', '#32c787', '#00BCD4', '#ff5652',
    '#ffc107', '#ff85af', '#FF9800', '#39bbb0'
];

function connect(event) {
    username = document.querySelector('#name').value.trim();

    if (username) {
        usernamePage.classList.add('hidden');
        chatPage.classList.remove('hidden');

        var socket = new SockJS('/ws');
        stompClient = Stomp.over(socket);

        stompClient.connect({}, onConnected, onError);
    }
    event.preventDefault();
}

function onConnected() {
    stompClient.subscribe('/topic/public', onMessageReceived);
    connectingElement.classList.add('hidden');
}

function onError(error) {
    connectingElement.textContent = 'Could not connect to WebSocket server. Please refresh this page to try again!';
    connectingElement.style.color = 'red';
}

function sendMessage(event) {
    var messageContent = messageInput.value.trim();
    if (messageContent && stompClient) {
        var message = {
            sender: username,
            content: messageInput.value
        };
        stompClient.send("/app/chat.sendMessage", {}, JSON.stringify(message));
        messageInput.value = '';
    }
    event.preventDefault();
}


// Fonction pour envoyer une demande de modification de message au serveur WebSocket
function editMessage(messageId, originalContent) {
    var newContent = prompt('Entrez le nouveau contenu du message :', originalContent);
    if (newContent !== null) {
        var updatedMessage = {
            id: messageId,
            content: newContent
        };
        stompClient.send("/app/chat.updateMessage", {}, JSON.stringify(updatedMessage));
    }
}


// Define the createMessageElement function
function createMessageElement(message) {
    var messageElement = document.createElement('li');
    messageElement.classList.add('message');
    messageElement.setAttribute('data-message-id', message.id);

    var avatarElement = document.createElement('i');
    var avatarText = document.createTextNode(message.sender[0]);
    avatarElement.appendChild(avatarText);
    avatarElement.style['background-color'] = getAvatarColor(message.sender);
    messageElement.appendChild(avatarElement);

    var usernameElement = document.createElement('span');
    var usernameText = document.createTextNode(message.sender);
    usernameElement.appendChild(usernameText);
    messageElement.appendChild(usernameElement);

    var textElement = document.createElement('p');
    var messageText = document.createTextNode(message.content);
    textElement.appendChild(messageText);
    messageElement.appendChild(textElement);

    // Add edit icon for the current user's message
    if (message.sender === username) {
        var editIcon = document.createElement('span');
        editIcon.innerHTML = ' &#9998;'; // Pencil icon
        editIcon.classList.add('edit-icon');
        editIcon.setAttribute('title', 'Edit message');
        editIcon.addEventListener('click', function() {
            editMessage(message.id, message.content);
        });
        messageElement.appendChild(editIcon);
    }

    return messageElement;
}


function onMessageReceived(payload) {
    var message = JSON.parse(payload.body);
    var messageElements = document.querySelectorAll('.message[data-message-id="' + message.id + '"]');

    if (messageElements.length > 0) {
        // Si le message existe déjà dans l'affichage, mettre à jour son contenu
        messageElements.forEach(function(element) {
            var messageContentElement = element.querySelector('p');
            messageContentElement.textContent = message.content;
        });
    } else {
        // Si le message n'existe pas dans l'affichage, créer un nouvel élément de message
        var newMessageElement = createMessageElement(message);
        messageArea.appendChild(newMessageElement);
        messageArea.scrollTop = messageArea.scrollHeight;
    }
}

function getAvatarColor(messageSender) {
    var hash = 0;
    for (var i = 0; i < messageSender.length; i++) {
        hash = 31 * hash + messageSender.charCodeAt(i);
    }
    var index = Math.abs(hash % colors.length);
    return colors[index];
}

usernameForm.addEventListener('submit', connect, true);
messageForm.addEventListener('submit', sendMessage, true);
