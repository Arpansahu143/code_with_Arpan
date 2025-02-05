
class College {
    String collegeName;
    String collegeLoc;


    College(String name, String loc) {
        this.collegeName = name;
        this.collegeLoc = loc;
    }
}


class Student {
    int studentId;
    String studentName;
    College college; 

    
    Student(int id, String name, College college) {
        this.studentId = id;
        this.studentName = name;
        this.college = college;
    }

    
    void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.collegeName);
        System.out.println("College Location: " + college.collegeLoc);
        System.out.println();
    }
}


public class Q6 {
    public static void main(String[] args) {
        
        College college1 = new College("ABC Engineering College", "Bhubaneswar");
        College college2 = new College("XYZ Institute of Technology", "Cuttack");

        
        Student student1 = new Student(101, "Rahul", college1);
        Student student2 = new Student(102, "Amit", college2);
        

        
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        
}
