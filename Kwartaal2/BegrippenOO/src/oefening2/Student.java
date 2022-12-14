package oefening2;

public class Student extends Klant {
    private String school;

    public Student(String naam, String voornaam, String email, String school) {
        super(naam, voornaam, email);
        this.school = school;
    }

    @Override
    public double koop(Artikel a) {
        return super.koop(a) - a.getKorting();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Student{" +
                "school='" + school + '\'' +
                '}';
    }
}
