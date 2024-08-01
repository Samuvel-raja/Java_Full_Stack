import { Component } from '@angular/core';
import { Invoice } from '../../model/Invoice';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  invoice:Invoice;
  constructor()
  {
    this.invoice=new Invoice();
  }
  insertDetails(data:any)
  {
    this.invoice.invoiceId = data.invoiceId;
    this.invoice.invoiceName = data.invoiceName;
    this.invoice.customerName = data.customerName;
    this.invoice.customerMail = data.customerMail;
    this.invoice.customerLoc = data.customerLoc;
    this.invoice.customerMob = data.customerMob;
    this.invoice.productName = data.productName;
    this.invoice.productQuantity = data.productQuantity;
    this.invoice.productPrice = data.productPrice;
    alert(data.invoiceId)
  }
}
