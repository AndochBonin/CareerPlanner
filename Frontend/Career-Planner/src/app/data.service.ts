import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Student } from './model/student';

import { Observable } from 'rxjs';

import { catchError, retry } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class DataService {

  public studentData: Student[] | any
  studentRequest: string = "QUERY HERE"
  constructor(private http: HttpClient ) { }

  getPosts(): Observable<Student[]>{
    return this.http.get<Student[]>(this.studentRequest);
  }
}
