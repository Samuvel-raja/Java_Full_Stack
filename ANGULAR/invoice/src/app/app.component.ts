import { Component } from '@angular/core';
import { Invoice } from './model/Invoice';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  invoice:Invoice;
  constructor()
  {
    this.invoice=new Invoice()
  }
  insertEmployee(data:any)
  {
     this.invoice.invoiceId = data.invoiceId;
     this.invoice.invoiceName = data.invoiceName;
     this.invoice.invoicePrice = data.invoicePrice;
     alert(data.invoiceId);
  }
}
