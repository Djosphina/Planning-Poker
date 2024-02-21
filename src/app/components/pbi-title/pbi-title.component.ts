import { Component, Input } from '@angular/core';

@Component({
  selector: 'pbi-title',
  templateUrl: './pbi-title.component.html',
  styleUrls: ['./pbi-title.component.css']
})
export class PbiTitleComponent {
  @Input() id!: number;
  @Input() name!: string;
  workItem:any;
}
