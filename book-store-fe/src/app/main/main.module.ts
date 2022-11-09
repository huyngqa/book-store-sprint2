import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MainRoutingModule } from './main-routing.module';
import { LoginComponent } from './components/login/login.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { ProductDetailsComponent } from './components/product-details/product-details.component';
import {HttpClientModule} from "@angular/common/http";


@NgModule({
  declarations: [LoginComponent, HomePageComponent, ProductDetailsComponent],
  exports: [
    HomePageComponent
  ],
  imports: [
    CommonModule,
    MainRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ]
})
export class MainModule { }
