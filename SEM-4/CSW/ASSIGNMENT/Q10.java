import java.util.*;


class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}


class Course {
    String courseCode;
    String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
}


class Enrollment {
    private List<String> enrollments = new ArrayList<>();

    public void enrollStudent(Student student, Course course) {
        enrollments.add(student.studentName + " enrolled in " + course.courseName);
        System.out.println(student.studentName + " enrolled in " + course.courseName);
    }

    public void displayEnrollments() {
        System.out.println("\nEnrollment List:");
        for (String record : enrollments) {
            System.out.println(record);
        }
    }
}


public class Q10 {
    public static void main(String[] args) {
        Enrollment enrollment = new Enrollment();
        
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(102, "Bob");
        
        Course course1 = new Course("CS101", "Computer Science");
        Course course2 = new Course("MATH101", "Mathematics");
        
        
        enrollment.enrollStudent(student1, course1);
        enrollment.enrollStudent(student1, course2);
        enrollment.enrollStudent(student2, course1);
        
        
        enrollment.displayEnrollments();
    }
}
