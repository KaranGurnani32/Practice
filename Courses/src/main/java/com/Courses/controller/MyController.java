package com.Courses.controller;

import com.Courses.repository.Course;
import com.Courses.service.MyService;
import com.Courses.service.MyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/home")
    public String home() {
        return "this is home page";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
//        System.out.println("hiii");
        return this.myService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable Long courseId) {
        return this.myService.getCourse(courseId);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.myService.addCourse(course);
    }
}
