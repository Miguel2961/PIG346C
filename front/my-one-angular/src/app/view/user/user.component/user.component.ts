import { Component } from '@angular/core';
// lybrary to import components
import { UserService } from '../../../services/user.service/user.service';
import { CommonModule, JsonPipe } from '@angular/common';
import { ChangeDetectorRef } from '@angular/core';

@Component({
  selector: 'app-user.component',
  imports: [ CommonModule, JsonPipe],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css',
  // template: '<p>hola desde user.componet.ts</p>',

})
export class UserComponent {
  users: any[] = [];

  constructor(private userServi: UserService , private cdt: ChangeDetectorRef){
    this.userServi.getUsers().subscribe(data =>{
      this.users = data;
      console.log(this.users);
      this.cdt.detectChanges(); // Detectar cambios manualmente
    
    });
  }

}
