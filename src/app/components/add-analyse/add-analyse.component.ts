import { Component } from '@angular/core';
import {AnalyseService} from "../../Service/analyse.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-add-analyse',
  templateUrl: './add-analyse.component.html',
  styleUrls: ['./add-analyse.component.css']
})
export class AddAnalyseComponent {
addanalyse!:FormGroup;
  listeProjets: any[] = [
    {id:1, algo:1, budget:1000, contraintes:"TEST1", date_debut:"2023-02-14 17:10:43.000000", date_fin:"2024-02-14 08:10:43.000000", dependance:"dep1", exigences:"equipe", objectif:"projet1", status:"0", titre:"POCKERPLANNING1", equipe_id:null},
    {id:2, algo:1, budget:1000, contraintes:"TEST2", date_debut:"2023-02-14 17:10:43.000000", date_fin:"2024-02-14 08:10:43.000000", dependance:"dep2", exigences:"equipe2", objectif:"projet2", status:"0", titre:"POCKERPLANNING2", equipe_id:null}
  ];
  constructor(private AS:AnalyseService,private fb :FormBuilder) {
  }
  ngOnInit(): void {
    this.addanalyse=this.fb.group({

      description: ['', Validators.required],  // Ajoutez des validateurs si nécessaire
        date_analyse: ['', Validators.required],
      projet: ['', Validators.required],
     // ticket: ['', Validators.required]
    });
  }
  Add(){this.AS.AjouterAnalyse(this.addanalyse.value).
  subscribe(()=>{alert("adde Success")
    console.log(this.addanalyse.value);
  })}
}
