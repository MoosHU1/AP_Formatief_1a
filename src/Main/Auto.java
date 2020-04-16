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



}
