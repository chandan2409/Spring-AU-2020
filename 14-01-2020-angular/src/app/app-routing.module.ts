import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {FormComponent} from './componants/form/form.component'
import {ViewformComponent} from './componants/viewform/viewform.component'
const routes: Routes = [
  { path: '', component: FormComponent },
  { path: 'home', component: FormComponent },
  { path: 'view', component: ViewformComponent },
  { path: '**', component: FormComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
