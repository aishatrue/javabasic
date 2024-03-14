package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age =25;
        student1.grade = 90;

        Student student2= new Student();
        student2.name ="학생2";
        student2.age= 16;
        student2.grade =80;

        // 배열은 같은 타입의 데이터들을 담을 수 있음. Student 클래스 타입의 데이터들을 모은것.
        Student[] students = new Student[]{student1,student2};

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name);

        }
        for(Student s: students){
            System.out.println(s.name+s.grade+s.age);
        }



    }
}
