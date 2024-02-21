import { Component, Input } from '@angular/core';
import { PokerserviceService } from 'src/app/services/pokerservice.service';

@Component({
  selector: 'participant',
  templateUrl: './participants.component.html',
  styleUrls: ['./participants.component.css']
})
export class ParticipantsComponent {
  data:any;
  average:any;
  @Input()
  participant!: string;

  @Input() selectedCard!: any ;

  constructor(private pokerService:PokerserviceService){  }
  ngOnInit(){
    }


}
