import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NavbarComponent } from './components/navbar/navbar.component';
import { AnalyseComponent } from './components/analyse/analyse.component';
import {AnalyseUsComponent} from "./components/analyse-us/analyse-us.component";
import {AnalyseProjetComponent} from "./components/analyse-projet/analyse-projet.component";
import {AddAnalyseComponent} from "./components/add-analyse/add-analyse.component";

const routes: Routes = [

  {path:'' , component:NavbarComponent , children:[
    { path: 'analyse',component:AnalyseComponent },
      { path: 'analyse_Projet',component:AnalyseProjetComponent},
      { path: 'analyse_Us',component:AnalyseUsComponent },
      { path: 'add_analyse',component:AddAnalyseComponent }
  ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
