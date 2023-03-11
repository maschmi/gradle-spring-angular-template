import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ExampleDomainComponent} from "./example/example-domain/example-domain.component";

const routes: Routes = [
  {path: 'example', component: ExampleDomainComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
