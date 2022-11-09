import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomePageComponent} from "./components/home-page/home-page.component";
import {LoginComponent} from "./components/login/login.component";
import {ProductDetailsComponent} from "./components/product-details/product-details.component";


const routes: Routes = [
  {
    path: '', component: HomePageComponent
  },
  {
    path: 'login', component: LoginComponent
  },
  {
    path: 'detail', component: ProductDetailsComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MainRoutingModule { }
