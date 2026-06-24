class CourseBase {
    String courseName;
    int duration;

    CourseBase(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourseBase extends CourseBase {
    String platform;
    boolean isRecorded;

    OnlineCourseBase(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourseBase {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, double discount) {

        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayCourseDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration : " + duration + " Days");
        System.out.println("Platform : " + platform);
        System.out.println("Recorded : " + isRecorded);
        System.out.println("Fee : " + fee);
        System.out.println("Discount : " + discount + "%");
    }
}

public class EducationalCourseHierarchy {

    public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Programming",
                60,
                "Udemy",
                true,
                5000,
                20
        );

        course.displayCourseDetails();
    }
}