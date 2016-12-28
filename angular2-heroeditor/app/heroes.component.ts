import { Component, OnInit } from '@angular/core';

import {Router} from '@angular/router';
import { Hero } from './hero';
import { HeroService } from './hero.service';



@Component({
  moduleId: module.id,
  selector: 'my-heroes',
  templateUrl: 'heroes.component.html',
  styleUrls: ['heroes.component.css']
})


export class HeroesComponent implements OnInit {
  heroes: Hero[];
  selectedHero: Hero;
  constructor(
    private router:Router,
    private heroService: HeroService) { }

  gerHeroes(): void {
    this.heroService.getHeroes().then(h => this.heroes = h);
  }

  onSelect(hero: Hero): void {
    this.selectedHero = hero;
  }

  ngOnInit(): void {
    this.gerHeroes();
  }

  gotoDetail(): void {
    this.router.navigate(['/detail', this.selectedHero.id]);
  }
}





