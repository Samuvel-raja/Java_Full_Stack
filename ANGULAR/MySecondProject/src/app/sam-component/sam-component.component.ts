import { Component } from '@angular/core';
import { MicroServiceService } from '../micro-service.service';
import { SampleService } from '../sample.service';


@Component({
  selector: 'app-sam-component',
  templateUrl: './sam-component.component.html',
  styleUrl: './sam-component.component.css'
})
export class SamComponentComponent {
  sum1:number;
  sum2:number;


  constructor(private micro:MicroServiceService,private samp:SampleService)
  {   this.sum1=0;
    this.sum1=micro.getAddition(10,5993)
    this.sum2=0;
  this.sum2=samp.getMultiply(10,20);
  }

}
