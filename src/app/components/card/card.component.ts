import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { PokerserviceService } from 'src/app/services/pokerservice.service';

@Component({
  selector: 'card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})

export class CardComponent  implements OnInit {
  @Input()
  card!: number;

  @Input() votingStarted!: boolean;

  test:Boolean = false ;

  @Output() cardSelected = new EventEmitter<number>();
  constructor(private pokerService:PokerserviceService){

  }

  ngOnInit(){


  }
  cardType(card:any){
    if(card==='waiting'){
      return true;
    }else{
      return false;
    }
  }

  selectCard(value:any){
     console.log("valuerr carte" , value) ;
     this.cardSelected.emit(value);
  }

}
