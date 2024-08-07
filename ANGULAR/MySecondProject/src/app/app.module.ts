import { Component, NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SamComponentComponent } from './sam-component/sam-component.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { RouterModule, Routes } from '@angular/router';
import { MicroServiceService } from './micro-service.service';
import { SampleService } from './sample.service';


const ROUTES:Routes=
[
  {path:'home',component: HomeComponent},
  {path:'contact',component: ContactComponent},
  {path:'about',component: AboutComponent},
]
@NgModule({
  declarations: [
    AppComponent,
    SamComponentComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [
    provideClientHydration(),
    MicroServiceService,
    SampleService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {

 }
 
