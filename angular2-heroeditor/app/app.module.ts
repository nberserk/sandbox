import { NgModule }      from '@angular/core';
import {RouterModule} from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import {HttpModule}      from '@angular/http';

// Imports for loading & configuring the in-memory web api
import { InMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService }  from './in-memory-data.service';

import { AppComponent }  from './app.component';
import { HeroDetailComponent } from './hero-detail.component';
import { HeroesComponent} from './heroes.component';
import { HeroService} from './hero.service';
import { DashboardComponent} from './dashboard.component';

import {AppRoutingModule} from './app-routing.module';

@NgModule({
  imports:      [ 
    BrowserModule, 
    FormsModule,
    AppRoutingModule,
    HttpModule,
    InMemoryWebApiModule.forRoot(InMemoryDataService),
    AppRoutingModule
  ],
  declarations: [ 
    AppComponent,
    HeroDetailComponent, 
    HeroesComponent,
    DashboardComponent,
  ],

  providers: [
    HeroService,
  ],
  bootstrap:    [ AppComponent ]
})

export class AppModule { }

