import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NavbarComponent } from './components/navbar/navbar.component';
import { PokerPlanningComponent } from './components/poker-planning/poker-planning.component';
import { AddSessionComponent } from './components/add-session/add-session.component';
import { ChronometerComponent } from './components/chronometer/chronometer.component';
import { VoteChartComponent } from './components/vote-chart/vote-chart.component';

const routes: Routes = [
  {path:'' , component:NavbarComponent , children:[
    {path:'addsession' , component:AddSessionComponent} ,
    {path:'poker' , component:PokerPlanningComponent} ,
    {path:'chronomoetre' , component:ChronometerComponent} ,
    {path:'votechart' , component:VoteChartComponent}
  ]},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
