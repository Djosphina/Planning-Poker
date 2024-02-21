import { ActivatedRoute, Router } from '@angular/router';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { PokerserviceService } from 'src/app/services/pokerservice.service';

@Component({
  selector: 'app-chronometer',
  templateUrl: './chronometer.component.html',
  styleUrls: ['./chronometer.component.css']
})
export class ChronometerComponent implements OnInit, OnDestroy {
  remainingTime: any;
  timerInterval: any;
  sessionId!:any;

  constructor(private pokerService: PokerserviceService , private router: Router , private route: ActivatedRoute) {}

  ngOnInit(): void {

 this.GetRemainingTime() ;

  }


GetRemainingTime(){
  this.pokerService.sessionId$.subscribe(sessionId => {
    this.sessionId = sessionId;
    this.pokerService.getRemainingTimeForSession(this.sessionId).subscribe(
      (response: any) => {
        this.remainingTime = response;
        this.startTimer();
      },
      (error) => {
        console.error('Error fetching remaining time:', error);
      }
    );
  });
}







  startTimer() {
    if (this.remainingTime && this.remainingTime.hours !== undefined && this.remainingTime.minutes !== undefined && this.remainingTime.seconds !== undefined) {
      let remainingSeconds = this.remainingTime.hours * 3600 + this.remainingTime.minutes * 60 + this.remainingTime.seconds;

      this.timerInterval = setInterval(() => {
        if (remainingSeconds <= 0) {
          clearInterval(this.timerInterval);

          this.router.navigateByUrl('poker');
        } else {
          remainingSeconds--;
          this.remainingTime = {
            hours: Math.floor(remainingSeconds / 3600),
            minutes: Math.floor((remainingSeconds % 3600) / 60),
            seconds: remainingSeconds % 60
          };
        }
      }, 1000);
    }
  }


  formatTime(time: number): string {
    return time < 10 ? `0${time}` : `${time}`;
  }

  ngOnDestroy(): void {
    clearInterval(this.timerInterval);
  }
}
