import {Component, Input, OnInit} from '@angular/core';
import {AsyncPipe, NgForOf} from "@angular/common";
import {filter, map, Observable, of} from "rxjs";

@Component({
  standalone: true,
  selector: 'app-example-component',
  templateUrl: './example-list-component.component.html',
  imports: [
    AsyncPipe,
    NgForOf
  ],
  styleUrls: ['./example-list-component.component.scss']
})
export class ExampleListComponentComponent {
  @Input() listElements$: Observable<Array<string> | undefined> = of([])
}
