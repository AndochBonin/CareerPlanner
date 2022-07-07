import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Student } from './model/student';

import { Observable } from 'rxjs';

import { catchError, retry } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient ) { }
}
