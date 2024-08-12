package project1;

import java.util.Scanner;

//CourseMenu.java
public class CourseMenu {
 private StudentManager studentManager;
 private CourseManager courseManager;
 private Scanner scanner;
 private Student currentUser;

 public CourseMenu() {
     studentManager = new StudentManager();
     courseManager = new CourseManager();
     scanner = new Scanner(System.in);
     currentUser = null;
 }

 public void run() {
     int choice = 0;
     while (choice != 6) {
         printMenu();
         choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline character after nextInt()

         switch (choice) {
             case 1:
                 login();
                 break;
             case 2:
                 addCourse();
                 break;
             case 3:
                 deleteCourse();
                 break;
             case 4:
                 searchCourse();
                 break;
             case 5:
                 printAllCourses();
                 break;
             case 6:
                 System.out.println("프로그램을 종료합니다.");
                 break;
             default:
                 System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                 break;
         }
     }
 }

 private void printMenu() {
     System.out.println("===== 수강신청 프로그램 메뉴 =====");
     System.out.println("1. 로그인");
     System.out.println("2. 수강 과목 추가");
     System.out.println("3. 수강 과목 삭제");
     System.out.println("4. 수강 과목 검색");
     System.out.println("5. 전체 강의 목록 출력");
     System.out.println("6. 프로그램 종료");
     System.out.print("메뉴를 선택하세요: ");
 }

 private void login() {
     System.out.print("학생 ID: ");
     String id = scanner.nextLine();
     System.out.print("비밀번호: ");
     String password = scanner.nextLine();

     currentUser = studentManager.login(id, password);

     if (currentUser != null) {
         System.out.println("로그인 성공: " + currentUser.getName() + " 학생");
     } else {
         System.out.println("로그인 실패: 학생 정보가 일치하지 않습니다.");
     }
 }

 private void addCourse() {
     if (currentUser == null) {
         System.out.println("로그인이 필요합니다.");
         return;
     }

     System.out.print("수강 신청할 강의 번호: ");
     int courseNumber = scanner.nextInt();
     scanner.nextLine(); // Consume newline character after nextInt()

     Course selectedCourse = courseManager.searchCourse(courseNumber);
     if (selectedCourse != null) {
         selectedCourse.setEnrolled(true);
         System.out.println("수강 신청 완료: " + selectedCourse.getCourseName());
     } else {
         System.out.println("해당하는 강의가 존재하지 않습니다: " + courseNumber);
     }
 }

 private void deleteCourse() {
     if (currentUser == null) {
         System.out.println("로그인이 필요합니다.");
         return;
     }

     System.out.print("수강 취소할 강의 번호: ");
     int courseNumber = scanner.nextInt();
     scanner.nextLine(); // Consume newline character after nextInt()

     Course selectedCourse = courseManager.searchCourse(courseNumber);
     if (selectedCourse != null && selectedCourse.isEnrolled()) {
         selectedCourse.setEnrolled(false);
         System.out.println("수강 취소 완료: " + selectedCourse.getCourseName());
     } else {
         System.out.println("수강 중인 강의가 아니거나 해당 강의가 존재하지 않습니다: " + courseNumber);
     }
 }

 private void searchCourse() {
     if (currentUser == null) {
         System.out.println("로그인이 필요합니다.");
         return;
     }

     System.out.print("검색할 강의 번호: ");
     int courseNumber = scanner.nextInt();
     scanner.nextLine(); // Consume newline character after nextInt()

     Course foundCourse = courseManager.searchCourse(courseNumber);
     if (foundCourse != null) {
         System.out.println(foundCourse);
     } else {
         System.out.println("해당하는 강의가 존재하지 않습니다: " + courseNumber);
     }
 }

 private void printAllCourses() {
     courseManager.printAllCourses();
 }

 public static void main(String[] args) {
     CourseMenu menu = new CourseMenu();
     menu.run();
 }
}

