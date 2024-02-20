import { Component } from '@angular/core';
import {AnalyseService} from "../../Service/analyse.service";

@Component({
  selector: 'app-analyse-projet',
  templateUrl: './analyse-projet.component.html',
  styleUrls: ['./analyse-projet.component.css']
})
export class AnalyseProjetComponent {


  listAnalyse!:any;

  constructor(private AS:AnalyseService){}
  /*
  ngOnInit(){
  this.AS.getAll().subscribe(
   { next:(data)=>this.listAnalyse=data }
  );}*/
  ngOnInit() {
    this.AS.getAnalyse_par_projet().subscribe(data => {
      console.log('Données récupérées1:', data);
      this.listAnalyse = data;
    }, error => {
      console.error('Erreur lors de la récupération des données:', error);
    });

  }
  }
