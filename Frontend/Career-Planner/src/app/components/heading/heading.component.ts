import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/data.service';
import { Student } from 'src/app/model/student';

@Component({
  selector: 'app-heading',
  templateUrl: './heading.component.html',
  styleUrls: ['./heading.component.css']
})
export class HeadingComponent implements OnInit {
  student: Student[] | any
  constructor(
    private dataService: DataService
  ) { }

  ngOnInit(): void {
    this.dataService.getPosts().subscribe(
      students => {
        this.student = students,
        this.dataService.studentData = students
      }
    )
  }

}
