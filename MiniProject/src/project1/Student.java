package project1;


public class Student {
 private String id;
 private String password;
 private String name;
 private int grade;
 private int studentNumber;

 public Student(String id, String password, String name, int grade, int studentNumber) {
     this.id = id;
     this.password = password;
     this.name = name;
     this.grade = grade;
     this.studentNumber = studentNumber;
 }

 public String getId() {
     return id;
 }

 public String getPassword() {
     return password;
 }

 public String getName() {
     return name;
 }

 public int getGrade() {
     return grade;
 }

 public int getStudentNumber() {
     return studentNumber;
 }

 @Override
 public String toString() {
     return "Student{" +
             "id='" + id + '\'' +
             ", password='" + password + '\'' +
             ", name='" + name + '\'' +
             ", grade=" + grade +
             ", studentNumber=" + studentNumber +
             '}';
 }
}

