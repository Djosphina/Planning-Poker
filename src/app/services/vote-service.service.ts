import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class VoteServiceService {
  BasedUrl = "http://localhost:8090/Pocker";
  constructor(private http:HttpClient) { }
  GetVotesByTickets(id:any){
   return this.http.get<any>(`${this.BasedUrl}/vote/getAllByTickets/${id}`);
  }
  AddVote(vote:any , idsession:any,idticket:any){
    return this.http.post<any>(`${this.BasedUrl}/vote/AddVote/${idsession}/${idticket}`,vote);
  }

}
