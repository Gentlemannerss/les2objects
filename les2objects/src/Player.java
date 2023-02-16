import java.time.LocalDate;

public class Player {
    // instance variables
    private String name;
    private LocalDate dob;
    private int salary;
    private char gender;
    private Team team;

    // constructor
    public Player(String name, LocalDate dob, int salary, char gender) {
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.gender = gender;
    }

    // methods
    void print() {
        System.out.println(this.name + " is born on " + this.dob + " and earns " + salary);
    }

    void setTeam(Team t) {
        this.team = t;
    }
}
