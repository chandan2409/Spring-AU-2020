import { Component, OnInit } from '@angular/core';
import { FormControl,FormGroup, Validators } from '@angular/forms';
import { UserDetailsService } from 'src/app/providers/user-details.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent implements OnInit {

  profileForm = new FormGroup({
    firstName: new FormControl(''),
    lastName: new FormControl(''),
    email: new FormControl('',Validators.email),
    Contact: new FormControl(''),
    address: new FormGroup({
      street: new FormControl(''),
      city: new FormControl(''),
      state: new FormControl(''),
      zip: new FormControl('')
    })
  });
  constructor(public userservice:UserDetailsService) { }

  ngOnInit() {
  }
  updateProfile() {

   
    this.userservice.setUserinfo(this.profileForm.value)


  }

}
