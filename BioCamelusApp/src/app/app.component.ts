import { Component, ViewChild } from '@angular/core';
import { Nav, Platform } from 'ionic-angular';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';

import { HomePage } from '../pages/home/home';
import { ListPage } from '../pages/list/list';
import { EjemploPage } from '../pages/ejemplo/ejemplo';
import { ScanearCodigoPage } from '../pages/scanear-codigo/scanear-codigo';
import { PuntoDeAcopioPage } from '../pages/punto-de-acopio/punto-de-acopio';
import { ProductoRegistradoPage } from '../pages/producto-registrado/producto-registrado';
import { VerProductoRecicladosPageModule } from '../pages/ver-producto-reciclados/ver-producto-reciclados.module';
import { VerProductoRecicladosPage } from '../pages/ver-producto-reciclados/ver-producto-reciclados';

@Component({
  templateUrl: 'app.html'
})
export class MyApp {
  @ViewChild(Nav) nav: Nav;

  rootPage: any = HomePage;

  pages: Array<{title: string, component: any}>;

  constructor(public platform: Platform, public statusBar: StatusBar, public splashScreen: SplashScreen) {
    this.initializeApp();

    // used for an example of ngFor and navigation
    this.pages = [
      { title: 'Home', component: HomePage },
      { title: 'List', component: ListPage },
      { title: 'Ejemplo', component: EjemploPage },
      { title: 'Scanea El Codigo', component: ScanearCodigoPage },
      { title: 'Puntos De Acopio', component: PuntoDeAcopioPage},
      { title: 'Producto Registrado', component: ProductoRegistradoPage},
      { title: 'Ver Producto Reciclados', component: VerProductoRecicladosPage}
    ];

  }

  initializeApp() {
    this.platform.ready().then(() => {
      // Okay, so the platform is ready and our plugins are available.
      // Here you can do any higher level native things you might need.
      this.statusBar.styleDefault();
      this.splashScreen.hide();
    });
  }

  openPage(page) {
    // Reset the content nav to have just this page
    // we wouldn't want the back button to show in this scenario
    this.nav.setRoot(page.component);
  }
}
