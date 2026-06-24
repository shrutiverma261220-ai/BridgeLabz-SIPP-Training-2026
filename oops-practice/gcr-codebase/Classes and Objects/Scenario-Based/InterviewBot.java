public class InterviewBot {

    // Instance Variables
    String botName;
    String technology;

    // Constructor
    InterviewBot(String botName, String technology) {
        this.botName = botName;
        this.technology = technology;
    }

    // Method
    void conductInterview() {
        System.out.println(botName + " is conducting a " + technology + " interview.");
    }

    // Main Method
    public static void main(String[] args) {

        InterviewBot bot1 = new InterviewBot("AI Recruiter", "Java");
        InterviewBot bot2 = new InterviewBot("Code Master", "Python");
        InterviewBot bot3 = new InterviewBot("Tech Expert", "Web Development");

        bot1.conductInterview();
        bot2.conductInterview();
        bot3.conductInterview();
    }
}