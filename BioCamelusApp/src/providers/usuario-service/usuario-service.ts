import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { GenericService } from '../generic-service';

/*
  Generated class for the UsuarioServiceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class UsuarioServiceProvider extends GenericService {
  url = 'https://jsonplaceholder.typicode.com/posts';

  constructor(private http: HttpClient) {
    super(http);
    console.log('Hello UsuarioServiceProvider Provider');
    this.apiURL = 'https://jsonplaceholder.typicode.com/users';
  }

}
