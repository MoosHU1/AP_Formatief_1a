package Main;

public class Klant {

    private String naam;
    private double kortingspercentage;

    public Klant (String nm) {
        naam = nm;



    }

    public void setKorting(double kP) {
        kortingspercentage = kP;

    }

    public double getKortingspercentage() {
        return kortingspercentage;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "\nop naam van: "+getNaam()+"(korting: "+getKortingspercentage()+(")");
    }
}
