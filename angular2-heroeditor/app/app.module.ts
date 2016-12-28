import { NgModule }      from '@angular/core';
import {RouterModule} from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';

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

