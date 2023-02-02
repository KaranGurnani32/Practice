package com.Courses.service;

import com.Courses.repository.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyServiceImpl implements MyService {

    List<Course> list;

    public MyServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(12, "Java Course", "this contains basics of Java"));
        list.add(new Course(44, "Python Course", "this contains basics of Python"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;

        for (Course course: list) {
            if (course.getId() == courseId) {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
