import java.util.Scanner;

public class StudentTest 
{      
    public static void main(String[ ] args)   
    {
        Student student1 = new Student("Leonardo", "Peta");
        System.out.println("Student name is " + student1.getName());

        Scanner input = new Scanner(System.in);
        int score = 0;
        System.out.print("Enter the number of quiz scores: ");
        int noOfScores = input.nextInt();
        for (int i=1; i <= noOfScores; i++)
        {
            System.out.print("Enter a score : ");
            score = input.nextInt();
            student1.addQuizScore(score);
        }
        
        System.out.println("Total quiz scores: " + student1.getTotalScore());
        System.out.printf("Average score is %6.2f", student1.getAverageScore());  
    }
}
