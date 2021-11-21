import { UsuarioDto } from './../../model/userDto';
import { UsuarioServiceProvider } from './../../providers/usuario-service/usuario-service';
import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  usuarios: UsuarioDto[];

  constructor(public navCtrl: NavController, private usuarioServiceProvider: UsuarioServiceProvider) {

  }

  async ionViewDidLoad(){
    await this.getUsuarios();
  }


  async getUsuarios() {

    this.usuarios = await this.usuarioServiceProvider.getAllAsync();

  }
  itemTapped(event, item) {
    // That's right, we're pushing to ourselves!
    // this.navCtrl.push(ListPage, {
    //   item: item
    // });
  }

}
