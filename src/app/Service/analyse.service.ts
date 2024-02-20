import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Analyse } from '../Models/Analyse';

@Injectable({
  providedIn: 'root'
})
export class AnalyseService {
url="http://localhost:8090/Pocker"

  constructor(private http:HttpClient) { }
getAll():Observable<Analyse[]>{
  const headers = new HttpHeaders({
    'Content-Type': 'application/json',
    'Accept': 'application/json'
  });
return this.http.get<Analyse[]>(this.url+'/retrieve-all-Analyses', { headers })
};

  getAnalyse_par_projet():Observable<Analyse[]>{
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Accept': 'application/json'
    });
    return this.http.get<Analyse[]>(
      "http://localhost:8090/Pocker/getAnalyses_par_projets")
  };

  AjouterAnalyse(analyse: Analyse): Observable<any> {

    return this.http.post(this.url+'/add-Analyse', analyse);
  }
  getAnalyse_par_Us():Observable<Analyse[]>{
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Accept': 'application/json'
    });
    return this.http.get<Analyse[]>(this.url+'/getAnalyses_par_us', { headers })
  };


}
