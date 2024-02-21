import { Component, EventEmitter, Input, Output } from '@angular/core';
import { PokerserviceService } from 'src/app/services/pokerservice.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'row',
  templateUrl: './row.component.html',
  styleUrls: ['./row.component.css']
})
export class RowComponent {

  @Input() workItems:any;

  @Output() voteStarted = new EventEmitter<void>();
  @Output() IdTickets = new EventEmitter<any>();
  constructor() { }

  ngOnInit() {

  }

  us(t: any) {
    let timerInterval: any;
    Swal.fire({
      title: "Vote Started!",
      html: "Start Voting Now",
      timer: 1030,
      timerProgressBar: true,
      didOpen: () => {
        Swal.showLoading();
        const popup = Swal.getPopup();
        if (popup) {
          const timer = popup.querySelector("b");
          if (timer) {
            timerInterval = setInterval(() => {
              timer.textContent = `${Swal.getTimerLeft()}`;
            }, 100);
          }
        }
      },
      willClose: () => {
        clearInterval(timerInterval);
      }
    }).then((result) => {
      if (result.dismiss === Swal.DismissReason.timer) {
        console.log("I was closed by the timer");
      }
      this.voteStarted.emit();
      this.IdTickets.emit(t.id);
    });
  }

}
