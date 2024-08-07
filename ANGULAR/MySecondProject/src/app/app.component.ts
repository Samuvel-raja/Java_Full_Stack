import { Component } from '@angular/core';
import { MicroServiceService } from './micro-service.service';
import { SampleService } from './sample.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
//   name: string;
//   age: number;
//   email: string;
//   color:string;
//   image:string;
//   fname:string;
//   flag:boolean;
//   vehicles:string[];
// selectedItem:string;
// myclass:string
// mystyle={}
//   constructor() {
//     this.name = 'sam';
//     this.age = 20;
//     this.email = 'sam@gmail.com';
//     this.color = 'red';
//     this.image='MySecondProject\src\assets\images\img1.png';
//     this.fname="";
//     this.flag=false
//     this.vehicles=["sam","vel","raja"]
//     this.selectedItem=""
//     this.mystyle={'width':"40%",'border':'2px solid aqua'}
//     this.myclass="color1"
//   }
//   changename()
//   {
//       this.name='velan';
//   }
//   getFunction(a:number,b:number)
//   {
//       return a+b;
//   }
//   changeFlag() {
//     this.flag = !this.flag;
//   }
//   setSelected(vec:string)
//   {
//     this.selectedItem=vec
//   }
sum1:number;
sum2:number;


constructor(private micro:MicroServiceService,private samp:SampleService)
{   this.sum1=0;
  this.sum1=micro.getAddition(10,39)
  this.sum2=samp.getMultiply(10,39)
  
}
}

