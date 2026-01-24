import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
// importing user services
import { UserService } from './services/user.service/user.service';
import { JsonPipe } from '@angular/common';
// Dectetar cambios
import { ChangeDetectorRef } from '@angular/core';
@Component({
  selector: 'app-root',
  imports: [RouterOutlet],  
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('my-one-angular');

  users: any[] = [];

  

  // detectChange(){
  //   this.chp.detectChanges
  // }
}
