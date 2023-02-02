package com.Courses.service;

import com.Courses.repository.Course;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface MyService {
    public List<Course> getCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);
}
