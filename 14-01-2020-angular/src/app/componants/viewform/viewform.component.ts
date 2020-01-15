import { Component, OnInit } from '@angular/core';
import { UserDetailsService } from 'src/app/providers/user-details.service';

@Component({
  selector: 'app-viewform',
  templateUrl: './viewform.component.html',
  styleUrls: ['./viewform.component.scss']
})
export class ViewformComponent implements OnInit {

  constructor(public userservice:UserDetailsService) { }
  userdetails=[]
  ngOnInit() {
    this.userdetails=this.userservice.getUserinfo();
  }

  
    delete(selectedItem: any) {
      for (let user of this.userdetails) {
        if (user.email === selectedItem.email&&user.Contact===selectedItem.Contact) {
            this.userdetails.splice(this.userdetails.indexOf(user), 1);
            break;

        }
    }

  }
   

}
