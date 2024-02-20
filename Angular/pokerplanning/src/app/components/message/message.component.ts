import { Component, OnInit } from '@angular/core';
import { Message } from 'src/app/models/message';
import { MessageService } from 'src/app/services/message.service';
@Component({
  selector: 'app-message',
  templateUrl: './message.component.html',
  styleUrls: ['./message.component.css']
})

export class MessageComponent implements OnInit {

  public messages: Message[] = [];
  public message: string = '';

  constructor(private messageService: MessageService) { }

  ngOnInit(): void {
    this.messageService.connect();
    this.messageService.getMessageStream().subscribe((message: Message) => {
      console.log('Received message:', message);
      this.messages.push(message);
    });
  }

  public sendMessage(): void {
    const messageToSend: Message = {
      content: this.message,
      sender: 'username', // Replace with actual sender username
      dateTime: new Date() // Set the current date and time
    };
    this.messageService.sendMessage(messageToSend);
    this.message = ''; // Clear the message input field
  }
}
  