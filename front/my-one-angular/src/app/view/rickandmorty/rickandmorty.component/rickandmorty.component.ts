import { Component } from '@angular/core';
import { RickandmortyService } from '../../../services/rickandmorty.service/rickandmorty.service';
import { ChangeDetectorRef } from '@angular/core';

@Component({
  selector: 'app-rickandmorty.component',
  imports: [],
  templateUrl: './rickandmorty.component.html',
  styleUrl: './rickandmorty.component.css',
})
export class RickandmortyComponent {

  rickandmortyCharacters: any[] = [];

  constructor(private ram: RickandmortyService ,private cd: ChangeDetectorRef) {
    this.ram.getrickandmortyCharacters().subscribe((data: any ) => {
      this.rickandmortyCharacters = data.results;
      console.log(this.rickandmortyCharacters);
      this.cd.detectChanges();
    });
  }

}
