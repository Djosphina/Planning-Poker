import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class TicketsserviceService {
  BasedUrl = "http://localhost:8090/Pocker";
  constructor(private http:HttpClient) { }

  GetBySession(idsession: any): Observable<any> {
    return this.http.get<any>(`${this.BasedUrl}/ticket/getlist/${idsession}` );
  }
  GetCarte(){
    return this.http.get(`${this.BasedUrl}/cards/getall`) ;
  }

}
