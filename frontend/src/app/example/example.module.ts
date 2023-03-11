import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ExampleDomainComponent } from './example-domain/example-domain.component';
import {ExampleListComponentComponent} from "../ui-components/example-list-component/example-list-component.component";



@NgModule({
  declarations: [
    ExampleDomainComponent
  ],
  imports: [
    CommonModule,
    ExampleListComponentComponent
  ]
})
export class ExampleModule { }
