import { Component } from '@angular/core';
import { BarcodeScanner } from '@ionic-native/barcode-scanner';
import { IonicPage, NavController, NavParams } from 'ionic-angular';



@IonicPage()
@Component({
  selector: 'page-scanear-codigo',
  templateUrl: 'scanear-codigo.html',
})
export class ScanearCodigoPage {

  constructor(public navCtrl: NavController, public navParams: NavParams, private barcodeScanner: BarcodeScanner) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad ScanearCodigoPage');
  }

  datocodificado: any;
  datoscaneado: {};


  LeerCode() {
    this.barcodeScanner.scan().then(barcodeData => {
      this.datoscaneado = barcodeData;
      console.log('Barcode data', barcodeData);
    })
      .catch(err => {
        console.log("Error", err);
      });
  }

  CodificarTexto() {
    this.barcodeScanner.encode(this.barcodeScanner.Encode.TEXT_TYPE, this.datocodificado).then(
      encodedData => {
        this.datocodificado = encodedData;
      },
      err => {
        console.log("Un error ha ocurrido: " + err);
      }
    );
  }

}
