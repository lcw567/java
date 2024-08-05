package project1;

import java.util.ArrayList;
import java.util.List;

// CourseManager.java
public class CourseManager {
    private List<Course> courseList;

    public CourseManager() {
        courseList = new ArrayList<>();
        initializeCourses(); // 테스트용 초기 강의 데이터 추가
    }

    private void initializeCourses() {
        courseList.add(new Course("자바", "김자바", 3, 1));
        courseList.add(new Course("파이썬", "김파이", 2, 2));
        courseList.add(new Course("C++", "김플플", 3, 3));
        courseList.add(new Course("루비", "김루비", 2, 4));
    }

    public void addCourse(Course course) {
        courseList.add(course);
        System.out.println("강의 추가: " + course.getCourseName());
    }

    public void deleteCourse(int courseNumber) {
        for (Course course : courseList) {
            if (course.getCourseNumber() == courseNumber) {
                courseList.remove(course);
                System.out.println("강의 삭제: " + course.getCourseName());
                return;
            }
        }
        System.out.println("해당하는 강의가 존재하지 않습니다: " + courseNumber);
    }

    public Course searchCourse(int courseNumber) {
        for (Course course : courseList) {
            if (course.getCourseNumber() == courseNumber) {
                return course;
            }
        }
        return null;
    }

    public void printAllCourses() {
        System.out.println("===== 전체 강의 목록 =====");
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    public List<Course> getCourseList() {
        return courseList;
    }
}
