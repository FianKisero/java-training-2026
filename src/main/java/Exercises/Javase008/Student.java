package Exercises.Javase008;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    public Student(String studentId, String name, int age, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setStudentIdetStudentId(String studentId) {
        if (studentId != null && studentId.matches("{6}")) {
            this.studentId = studentId;
        } else {
            System.out.println("Invalid Student Id!, 6 alphanumeric characters needed.");
        }
    }
    public void setName(String name) {
        if (name != null && name.trim().length() > 2) {
            this.name = name;
        }  else {
            System.out.println("Invalid Student Name!, 2 alphanumeric characters needed.");
        }
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 100) {
            this.age = age;
        }  else {
            System.out.println("Invalid Student Age!, age must be between 16 and 100.");
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }  else {
            System.out.println("Invalid Student GPA!, GPA must be between 0.0 and 4.0.");
        }
    }

    public void display() {
        System.out.println("Student Id: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

}
