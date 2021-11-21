import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { ListPage } from '../pages/list/list';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { EjemploPage } from '../pages/ejemplo/ejemplo';
import { ScanearCodigoPage } from '../pages/scanear-codigo/scanear-codigo';
import { PuntoDeAcopioPage } from '../pages/punto-de-acopio/punto-de-acopio';
import { ProductoRegistradoPage } from '../pages/producto-registrado/producto-registrado';
import { VerProductoRecicladosPageModule } from '../pages/ver-producto-reciclados/ver-producto-reciclados.module';
import { VerProductoRecicladosPage } from '../pages/ver-producto-reciclados/ver-producto-reciclados';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    ListPage,
    EjemploPage,
    ScanearCodigoPage,
    PuntoDeAcopioPage,
    ProductoRegistradoPage,
    VerProductoRecicladosPage


  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    ListPage,
    EjemploPage,
    ScanearCodigoPage,
    PuntoDeAcopioPage,
    ProductoRegistradoPage,
    VerProductoRecicladosPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
