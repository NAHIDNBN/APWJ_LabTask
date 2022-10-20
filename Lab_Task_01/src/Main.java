import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setname("Nahid");
        LocalDate birthDate = LocalDate.of(1999, 02, 05);
        LocalDate date = LocalDate.now();
        System.out.println("Name is ;"+s1.getname());
        s1.calculateAge(birthDate,date);

    }
}