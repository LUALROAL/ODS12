import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ProductoRegistradoPage } from './producto-registrado';

@NgModule({
  declarations: [
    ProductoRegistradoPage,
  ],
  imports: [
    IonicPageModule.forChild(ProductoRegistradoPage),
  ],
})
export class ProductoRegistradoPageModule {}
