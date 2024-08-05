package project1;

import java.util.ArrayList;
import java.util.List;

// StudentManager.java
public class StudentManager {
    private List<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
        initializeStudents(); // 테스트용 초기 학생 데이터 추가
    }

    private void initializeStudents() {
        studentList.add(new Student("aa", "aaa", "학생a", 1, 1));
        studentList.add(new Student("bb", "bbb", "학생b", 2, 2));
        studentList.add(new Student("cc", "ccc", "학생c", 3, 3));
        studentList.add(new Student("dd", "ddd", "학생d", 4, 4));
    }

    public Student login(String id, String password) {
        for (Student student : studentList) {
            if (student.getId().equals(id) && student.getPassword().equals(password)) {
                return student;
            }
        }
        return null;
    }
}

