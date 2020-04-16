package Main;

public class Auto {

    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd){
        type = tp;
        prPd = prijsPerDag;

    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\nautotype: " +getType()+" met prijs per dag: "+getPrijsPerDag();
    }
}
