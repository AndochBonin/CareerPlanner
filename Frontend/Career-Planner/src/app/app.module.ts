import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';


import {HttpClientModule} from '@angular/common/http'

import { DataService } from './data.service';


import { AppComponent } from './app.component';
import { HeadingComponent } from './components/heading/heading.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { MainComponent } from './components/main/main.component';
import { SignUpComponent } from './components/sign-up/sign-up.component';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AppRoutingModule } from './app-routing.module';
import { CareerComponent } from './components/career/career.component';


@NgModule({
  declarations: [
    AppComponent,
    HeadingComponent,
    SidebarComponent,
    MainComponent,
    SignUpComponent,
    LoginComponent,
    DashboardComponent,
    CareerComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule {
 }
