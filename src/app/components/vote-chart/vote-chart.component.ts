import { Component, Input, OnInit } from '@angular/core';
import { Chart , registerables } from 'node_modules/chart.js';
import { TicketsserviceService } from 'src/app/services/ticketsservice.service';
import { VoteServiceService } from 'src/app/services/vote-service.service';
Chart.register(...registerables) ;
@Component({
  selector: 'vote-chart',
  templateUrl: './vote-chart.component.html',
  styleUrls: ['./vote-chart.component.css']
})
export class VoteChartComponent implements OnInit {
  @Input() voteData: number[] = [];
  chartData: any;
   cards!:any;

   @Input() Idtickets!: number;

  constructor(private Ticketsservice:TicketsserviceService , private voteservice:VoteServiceService){}

  ngOnInit() {
 this.GetVoteResults() ;
}

GetVoteResults(){
 this.voteservice.GetVotesByTickets(this.Idtickets).subscribe((data)=>{
  const labels = Object.keys(data);
  const values = Object.values(data);
   const canvas = document.getElementById('votesChart');
   if (canvas instanceof HTMLCanvasElement && canvas !== null) {
       const ctx = canvas.getContext('2d');
       if (ctx !== null) {

           new Chart(ctx, {
               type: 'doughnut',
               data: {
                   labels: labels,
                   datasets: [{
                       label: 'Vote Count',
                       data: values,
                       backgroundColor: [
                        'rgba(255, 99, 132, 0.5)',
                        'rgba(54, 162, 235, 0.5)',
                        'rgba(255, 206, 86, 0.5)',
                        'rgba(75, 192, 192, 0.5)',
                        'rgba(153, 102, 255, 0.5)',
                        'rgba(255, 159, 64, 0.5)',
                        'rgba(128, 0, 0, 0.5)',
                        'rgba(0, 128, 0, 0.5)',
                        'rgba(0, 0, 128, 0.5)',
                        'rgba(255, 255, 0, 0.5)',
                        'rgba(0, 255, 255, 0.5)',
                        'rgba(255, 0, 255, 0.5)',
                        'rgba(128, 128, 0, 0.5)',
                        'rgba(128, 0, 128, 0.5)',
                        'rgba(0, 128, 128, 0.5)',
                        'rgba(192, 192, 192, 0.5)',
                        'rgba(128, 128, 128, 0.5)',
                        'rgba(255, 255, 255, 0.5)',
                        'rgba(0, 0, 0, 0.5)',
                        'rgba(255, 140, 0, 0.5)',
                    ],
                    borderColor: [
                        'rgba(255, 99, 132, 1)',
                        'rgba(54, 162, 235, 1)',
                        'rgba(255, 206, 86, 1)',
                        'rgba(75, 192, 192, 1)',
                        'rgba(153, 102, 255, 1)',
                        'rgba(255, 159, 64, 1)',
                        'rgba(128, 0, 0, 1)',
                        'rgba(0, 128, 0, 1)',
                        'rgba(0, 0, 128, 1)',
                        'rgba(255, 255, 0, 1)',
                        'rgba(0, 255, 255, 1)',
                        'rgba(255, 0, 255, 1)',
                        'rgba(128, 128, 0, 1)',
                        'rgba(128, 0, 128, 1)',
                        'rgba(0, 128, 128, 1)',
                        'rgba(192, 192, 192, 1)',
                        'rgba(128, 128, 128, 1)',
                        'rgba(255, 255, 255, 1)',
                        'rgba(0, 0, 0, 1)',
                        'rgba(255, 140, 0, 1)',
                    ]
                    ,
                       borderWidth: 1
                   }]
               },
               options: {
                scales: {
                  y: {
                    beginAtZero: true
                  }
                }
              }
           });
       } else {
           console.error('Failed to get 2D context for canvas element');
       }
   } else {
       console.error('Canvas element with ID "votesChart" not found');
   }
});


}
}
