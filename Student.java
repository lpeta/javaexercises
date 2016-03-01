public class Student
{
    // … declare private data
    private String name;
    private int totalScore;
    private int scoreCount;
    
    /* methods (public interface) */
    public void addQuizScore(int score)
    {
        totalScore += score;
        scoreCount++;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getTotalScore()
    {
        return totalScore;
    }
    public double getAverageScore()
    {
        return (double) totalScore/scoreCount;
    }
        /* constructor */
    public Student(String firstName, String lastName)
    {
        name = firstName + " " + lastName;
        totalScore = 0;
        scoreCount = 0;
        
       
    }
    
    
}
