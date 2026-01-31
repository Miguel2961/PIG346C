import { Routes } from '@angular/router';
import { UserComponent } from './view/user/user.component/user.component';
import { RickandmortyComponent } from './view/rickandmorty/rickandmorty.component/rickandmorty.component';

export const routes: Routes = [
    {path: '', redirectTo: 'user', pathMatch:'full'},
    {path: 'user', component: UserComponent},
    {path: 'rickandmorty', component: RickandmortyComponent}
];
