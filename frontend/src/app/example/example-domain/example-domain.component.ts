import {Component, OnInit} from '@angular/core';
import {ExampleQueryService} from "../../../generated/example";
import {map, Observable, of} from "rxjs";

@Component({
  selector: 'app-example-domain',
  templateUrl: './example-domain.component.html',
  styleUrls: ['./example-domain.component.scss']
})
export class ExampleDomainComponent implements OnInit {
  listElements$: Observable<Array<string> | undefined> = of([]);

  constructor(private exampleService: ExampleQueryService) {
  }

  ngOnInit(): void {
    this.listElements$ = this.exampleService
      .getSomething()
      .pipe(map(res => res.values))
  }
}
