import { NgModule, isDevMode } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ApiModule as ExampleApiModules, Configuration, ConfigurationParameters} from '../generated/example'
import { ApiModule as AnotherExampleApiModules } from '../generated/example2'
import {HttpClientModule} from "@angular/common/http";
import {environment} from "../environments/environment";
import {ExampleModule} from "./example/example.module";
import { EntityDataModule } from '@ngrx/data';
import { entityConfig } from './entity-metadata';
import { StoreDevtoolsModule } from '@ngrx/store-devtools';
import { StoreModule } from '@ngrx/store';

export function apiConfigFactory (): any {
  const params: ConfigurationParameters = {
    basePath: environment.apiUrl
  }
  return new Configuration(params);
}

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    ExampleApiModules.forRoot(apiConfigFactory),
    AnotherExampleApiModules.forRoot(apiConfigFactory),
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    ExampleModule,
    EntityDataModule.forRoot(entityConfig),
    StoreDevtoolsModule.instrument({ maxAge: 25, logOnly: !isDevMode() }),
    StoreModule.forRoot({}, {})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
