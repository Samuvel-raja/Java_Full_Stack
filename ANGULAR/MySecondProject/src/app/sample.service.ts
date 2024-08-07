import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SampleService {

  constructor() { }

    getMultiply(a:number,b:number)
    {
      return a*b;
    }
}
