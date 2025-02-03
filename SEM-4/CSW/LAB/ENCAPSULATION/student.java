class Stdnt {
    private String name;
    private int age;
    private char grade;

    public Stdnt() {
        this.name = "Unknown";
        this.age = 18;
        this.grade = 'C';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 5 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Age must be between 5 and 100.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGrade(char grade) {
        if (grade >= 'A' && grade <= 'F') {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between A and F.");
        }
    }

    public char getGrade() {
        return grade;
    }
}

public class student {
    public static void main(String[] args) {
        Stdnt s = new Stdnt();
        s.setName("Rahul");
        s.setAge(20);
        s.setGrade('A');

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Grade: " + s.getGrade());
    }
}