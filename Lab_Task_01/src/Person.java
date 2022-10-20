import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;

    public void setname(String name)
    {
        this.name = name;
    }
    public String getname()
    {
        return name;
    }

    public static void calculateAge(LocalDate birthdate, LocalDate currentDate){
        if ((birthDate != null) && (currentDate != null)){
            Period period = Period.between(birthDate, currentDate);
            System.out.println("Age is "+period.getYears()+"Years "+period.getMonths()+"Month"+period.getDays()+"Days");
        }
        else{
            System.out.println("Birth Date can't be null");
        }
    }

}
