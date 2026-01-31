import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class RickandmortyService {
    
  constructor(private http: HttpClient) { }
    getrickandmortyCharacters(){
      return this.http.get<any[]>('https://rickandmortyapi.com/api/character');
    }
   
}
