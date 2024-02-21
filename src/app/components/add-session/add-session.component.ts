import { Component } from '@angular/core';
import { PokerPlanningComponent } from '../poker-planning/poker-planning.component';
import { PokerserviceService } from 'src/app/services/pokerservice.service';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-session',
  templateUrl: './add-session.component.html',
  styleUrls: ['./add-session.component.css']
})
export class AddSessionComponent {

  Session={} ;
  constructor(private pokerservice:PokerserviceService , private router:Router){
  }


  AddSession(){
    this.pokerservice.addSession(this.Session).subscribe(
      (response) =>{
        Swal.fire({
          title: "Added Succesfully",
          text: "You Added A New Session!",
          icon: "success"
        });


        this.pokerservice.setSessionId(response.id);
        this.router.navigate(['/chronomoetre']);


      } , (errot)=>{
        Swal.fire({
          icon: "error",
          title: "error...",
          text: "Error While Adding A Session!",

        });
      }
     )}
  }

