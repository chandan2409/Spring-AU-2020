import { Injectable } from '@angular/core';
import { stripGeneratedFileSuffix } from '@angular/compiler/src/aot/util';

@Injectable({
  providedIn: 'root'
})
export class UserDetailsService {
  userinfo=[]
  constructor() { }

  setUserinfo(user)
  {
    this.userinfo.push(user)
    console.log(this.userinfo)
  }
  getUserinfo(){

    return this.userinfo
  }
 
}
