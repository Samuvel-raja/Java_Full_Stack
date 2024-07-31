import { Injectable } from '@angular/core';

@Injectable()
export class MicroServiceService {

  constructor() {
  }
    getAddition(a:number,b:number)
    {
      return a+b;
    }
    getSubtraction(a:number,b:number)
    {
      return a-b;
    }
  
   
}
