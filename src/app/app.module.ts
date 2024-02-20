import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { AnalyseComponent } from './components/analyse/analyse.component';
import {HttpClientModule} from '@angular/common/http';
import { OneAnalyseComponent } from './components/one-analyse/one-analyse.component';
import { AnalyseProjetComponent } from './components/analyse-projet/analyse-projet.component';
import { AnalyseUsComponent } from './components/analyse-us/analyse-us.component';
import { AddAnalyseComponent } from './components/add-analyse/add-analyse.component';
import {ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    AnalyseComponent,
    OneAnalyseComponent,
    AnalyseProjetComponent,
    AnalyseUsComponent,
    AddAnalyseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
