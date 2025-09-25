public class c {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(s1);
    }
}

class Student{
    String name;
    String roll;

    Student(){
    }

    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
}
