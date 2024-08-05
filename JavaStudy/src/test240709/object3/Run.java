package test240709.object3;

public class Run {

    public static void main(String[] args) {
        // Student 객체 생성
        Student student = new Student();

        // 필드 값 설정
        student.setGrade(1);
        student.setClassroom(2);
        student.setName("이찬우");
        student.setHeight(177);
        student.setGender('남');

        // 정보 출력
        student.information();
    }

}


