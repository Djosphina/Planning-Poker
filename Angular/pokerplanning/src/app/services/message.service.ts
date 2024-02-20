import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { WebSocketSubject } from 'rxjs/webSocket';
import { Message } from '../models/message';

@Injectable({
  providedIn: 'root'
})
export class MessageService {

  private socket$!: WebSocketSubject<Message>;

  constructor() { }

  public connect(): void {
    this.socket$ = new WebSocketSubject('ws://localhost:8089/ws'); 
  }

  public sendMessage(message: Message): void {
    this.socket$.next(message);
  }

  public getMessageStream(): Observable<Message> {
    return this.socket$.asObservable();
  }

}