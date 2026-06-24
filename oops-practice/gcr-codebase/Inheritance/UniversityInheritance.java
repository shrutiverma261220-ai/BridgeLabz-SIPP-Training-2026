class UniversityPerson {
    String name;
    int age;

    UniversityPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name       : " + name +
               "\nAge        : " + age;
    }
}

class UniversityStudent extends UniversityPerson {
    final int studentId;
    double gpa;

    UniversityStudent(String name, int age, int studentId, double gpa) {
        super(name, age);   // Calls Person constructor
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nStudent ID : " + studentId +
               "\nGPA        : " + gpa;
    }
}

class UniversityGradStudent extends UniversityStudent {
    String thesis;

    UniversityGradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);   // Calls Student constructor
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nThesis     : " + thesis;
    }
}

public class UniversityInheritance {

    public static void main(String[] args) {

        UniversityGradStudent gradStudent =
                new UniversityGradStudent(
                        "Shruti Verma",
                        22,
                        101,
                        9.4,
                        "Artificial Intelligence");

        System.out.println("----- Graduate Student Details -----");
        System.out.println(gradStudent);

        System.out.println("\nIS-A Relationship:");

        System.out.println("GradStudent IS-A Student : "
                + (gradStudent instanceof UniversityStudent));

        System.out.println("GradStudent IS-A Person : "
                + (gradStudent instanceof UniversityPerson));
    }
}