package project1;

//Course.java
public class Course {
 private String courseName;
 private String professor;
 private int credits;
 private int courseNumber;
 private boolean enrolled;

 public Course(String courseName, String professor, int credits, int courseNumber) {
     this.courseName = courseName;
     this.professor = professor;
     this.credits = credits;
     this.courseNumber = courseNumber;
     this.enrolled = false;
 }

 public String getCourseName() {
     return courseName;
 }

 public String getProfessor() {
     return professor;
 }

 public int getCredits() {
     return credits;
 }

 public int getCourseNumber() {
     return courseNumber;
 }

 public boolean isEnrolled() {
     return enrolled;
 }

 public void setEnrolled(boolean enrolled) {
     this.enrolled = enrolled;
 }

 @Override
 public String toString() {
     String enrolledStatus = enrolled ? "수강신청 완료" : "미수강신청";
     return "강의명: " + courseName + ", 담당교수: " + professor + ", 학점: " + credits +
             "학점, 강의번호: " + courseNumber + ", 수강신청 여부: " + enrolledStatus;
 }
}

