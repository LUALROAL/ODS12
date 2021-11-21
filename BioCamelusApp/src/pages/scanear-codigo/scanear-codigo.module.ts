import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ScanearCodigoPage } from './scanear-codigo';

@NgModule({
  declarations: [
    ScanearCodigoPage,
  ],
  imports: [
    IonicPageModule.forChild(ScanearCodigoPage),
  ],
})
export class ScanearCodigoPageModule {}
