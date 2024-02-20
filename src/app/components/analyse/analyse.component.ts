import {Component, EventEmitter, Input, Output} from '@angular/core';
import { AnalyseService } from 'src/app/Service/analyse.service';
import {Analyse} from "../../Models/Analyse";

@Component({
  selector: 'app-analyse',
  templateUrl: './analyse.component.html',
  styleUrls: ['./analyse.component.css']
})
export class AnalyseComponent {

  listAnalyse!:any;
  @Input()p!:Analyse;

constructor(private AS:AnalyseService){}
  ngOnInit() {
    this.AS.getAll().subscribe(data => {
      console.log('Données récupérées1:', data);
      this.listAnalyse = data;
    }, error => {
      console.error('Erreur lors de la récupération des données:', error);
    });

  }









}
