import { HttpClient  } from '@angular/common/http';
import { EventEmitter, Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PokerserviceService {
  BasedUrl = "http://localhost:8090/Pocker";
  private sessionIdSubject = new BehaviorSubject<number | null>(null);
  sessionId$ = this.sessionIdSubject.asObservable();

  setSessionId(sessionId: number) {
    this.sessionIdSubject.next(sessionId);
  }

  private data = new BehaviorSubject([]);
  dummyData=this.data.asObservable();
  counter=0;
  DUMMY_DATA= [
    {
    pokerPlanTitle:"Poker title",




    }
  ]
  constructor(private http:HttpClient) { }






  getPokerData(){
    return this.DUMMY_DATA;
  }

  addSession(session: any): Observable<any> {
    return this.http.post<any>(`${this.BasedUrl}/session/AddSession` ,session);
  }
  getRemainingTimeForSession(sessionId: number): Observable<string> {
    return this.http.get<string>(`${this.BasedUrl}/session/remaining-time/${sessionId}`);
  }
}
