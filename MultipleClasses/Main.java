package MultipleClasses;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create 10 students
        Student rohan = new Student(1, "Rohan", "rohan@email.com", 1234567890l);
        Student parshant = new Student(2, "Parshant", "parshant@email.com", 8745825798l);
        Student dhruv = new Student(3, "Dhruv", "dhruv@email.com", 234233523l);
        Student student4 = new Student(4, "student4", "s4@email.com", 1233463440l);
        Student student5 = new Student(5, "student5", "s5@email.com", 3646546890l);
        Student student6 = new Student(6, "student6", "s6@email.com", 1234577890l);
        Student student7 = new Student(7, "student7", "s7@email.com", 464574890l);
        Student student8 = new Student(8, "student8", "s8@email.com", 9678577890l);
        Student student9 = new Student(9, "student9", "s9@email.com", 1247457890l);
        Student student10 = new Student(10, "student10", "s10@email.com", 5747457890l);

        // create 5 techstack
        TechStack java = new TechStack(1, "Java", "Java Description");
        TechStack english = new TechStack(2, "English", "Interview and fluen");
        TechStack ruby = new TechStack(3, "Java", "Java Description");
        TechStack spring = new TechStack(4, "Java", "Java Description");
        TechStack django = new TechStack(5, "Java", "Java Description");

        // Create 3 trainers
        List<TechStack> trainer1TechStacks = new ArrayList<>();
        trainer1TechStacks.add(java);
        trainer1TechStacks.add(english);

        Trainer tusharSir = new Trainer(1, "Tushar Sir", "tusharv@gmail.com", 1234567890L, trainer1TechStacks);

        List<TechStack> trainer2TechStacks = new ArrayList<>();
        trainer2TechStacks.add(ruby);
        trainer2TechStacks.add(django);

        Trainer nehaMam = new Trainer(2, "Neha Mam", "neham@gmail.com", 9876543210L, trainer2TechStacks);

        List<TechStack> trainer3TechStacks = new ArrayList<>();
        trainer3TechStacks.add(spring);

        Trainer amanSir = new Trainer(3, "Aman Sir", "amans@gmail.com", 5555555555L, trainer3TechStacks);

        // create 16 answer objects.

        Answer answer1 = new Answer(1, "Option A");
        Answer answer2 = new Answer(2, "Option B");
        Answer answer3 = new Answer(3, "Option C");
        Answer answer4 = new Answer(4, "Option D");
        Answer answer5 = new Answer(5, "Option A");
        Answer answer6 = new Answer(6, "Option D");
        Answer answer7 = new Answer(7, "Option A");
        Answer answer8 = new Answer(8, "Option D");
        Answer answer9 = new Answer(9, "Option C");
        Answer answer10 = new Answer(10, "Option A");
        Answer answer11 = new Answer(11, "Option B");
        Answer answer12 = new Answer(12, "Option A");
        Answer answer13 = new Answer(13, "Option B");
        Answer answer14 = new Answer(14, "Option B");
        Answer answer15 = new Answer(15, "Option C");
        Answer answer16 = new Answer(16, "Option A");

        // String AnswerKey
        String[] anskey = { "1. Options A", "2. Options B", "3. Options C", "4. Options D", "5. Options A",
                "6. Options D", "7. Options A", "8. Options D", "9. Options C", "10. Options A", "11. Options B",
                "12. Options A", "13. Options B", "14. Options B", "15. Options C", "16. Options A" };

        // create 16 Question Objects

        Question q1 = new Question(1, answer1, anskey, 1, 1, 1);
        Question q2 = new Question(1, answer2, anskey, 1, 2, 1);
        Question q3 = new Question(3, answer3, anskey, 1, 3, 1);
        Question q4 = new Question(4, answer4, anskey, 1, 4, 1);
        Question q5 = new Question(5, answer5, anskey, 1, 5, 2);
        Question q6 = new Question(6, answer6, anskey, 1, 1, 2);
        Question q7 = new Question(7, answer7, anskey, 1, 2, 2);
        Question q8 = new Question(8, answer8, anskey, 1, 3, 2);
        Question q9 = new Question(9, answer9, anskey, 1, 4, 3);
        Question q10 = new Question(10, answer10, anskey, 1, 5, 3);
        Question q11 = new Question(11, answer11, anskey, 1, 1, 3);
        Question q12 = new Question(12, answer12, anskey, 1, 2, 3);
        Question q13 = new Question(13, answer13, anskey, 1, 3, 4);
        Question q14 = new Question(14, answer14, anskey, 1, 4, 4);
        Question q15 = new Question(15, answer15, anskey, 1, 5, 4);
        Question q16 = new Question(16, answer16, anskey, 1, 1, 4);

        // Creating the question list

        List<Question> questionList1 = Arrays.asList(q1, q2, q3, q4);
        List<Question> questionList2 = Arrays.asList(q5, q6, q7, q8);
        List<Question> questionList3 = Arrays.asList(q9, q10, q11, q12);
        List<Question> questionList4 = Arrays.asList(q13, q14, q15, q16);

        // Create 4 assignments with 4 questions each

        Assignment assignment1 = new Assignment(1, "Assignment1", "English Fluency", LocalDate.of(2024, 12, 30),
                questionList1);

        Assignment assignment2 = new Assignment(2, "Assignment2", "Learning DSA", LocalDate.of(2024, 1, 23),
                questionList2);

        Assignment assignment3 = new Assignment(3, "Assignment3", "Learning Spring boot", LocalDate.of(2024, 4, 12),
                questionList3);

        Assignment assignment4 = new Assignment(4, "Assignment4", "competetive programming Skills",
                LocalDate.of(2024, 1, 14), questionList4);

        // Create Results on the above data

        Result rohanresult1 = new Result(1, rohan, assignment1, tusharSir, 90, "Good Job", LocalDate.of(2024, 1, 19));
        Result parashant2 = new Result(2, parshant, assignment2, nehaMam, 85, "Well Done", LocalDate.of(2024, 1, 11));
        Result parashant1 = new Result(3, dhruv, assignment3, amanSir, 75, "Nice Effort", LocalDate.of(2024, 1, 13));
        Result rohanresult2 = new Result(4, rohan, assignment4, tusharSir, 80, "Great Work", LocalDate.of(2024, 1, 4));

        // Create ResultsData on the above data

        ResultsData resultData = new ResultsData();
        resultData.addResult(rohanresult2);
        resultData.addResult(parashant1);
        resultData.addResult(parashant2);
        resultData.addResult(rohanresult1);

        // printing the result data.
        // resultData.showResult();

        // Methods to be performed given in the Jira Ticket.

        // 1. Method to find the highest performing student.
        // resultData.getBestStudent();

        // 2. Method to find the second highest performing Student
        // resultData.getSecondBestStudent();

        // 3. Method to find the overall ranking of Students by Score:
        // resultData.studentByRank();

        // 4. Get all the Students who need improvement and scored less than 60%.
        // resultData.badStudents();

        // 5. Get Specific Student by name
        // resultData.getSpecificStudent("Prashant"); // for Rohan Type Rohan

        // 6. Get Student Result in Group
        // resultData.getAllResults();
    }
}
