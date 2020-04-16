package Main;

public class AutoHuur{

    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant Huurder;



    public AutoHuur(){

    }

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public void setGehuurdeAuto(Auto gA){
        gehuurdeAuto = gA;

    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        Huurder = k;
    }

    public Klant getHuurder() {
        return Huurder;
    }

    public double TotaalPrijs(Auto auto){
        return aantalDagen*auto.getPrijsPerDag();

    }

    public String toStringl() {
        String s = "";
        if (getGehuurdeAuto() == null){
            s = s+"\nEr is geen auto bekend";
        }
        else{
            s = s+getGehuurdeAuto();
        }

        if (getHuurder() == null){
            s = s+"\nEr is geen huurder bekend";
        }
        else{
            s = s+getHuurder();
        }
        if (getGehuurdeAuto() == null) {
            s = s + "\naantal dagen: 0 en dat kost 0.0";
        }
        else{
            s = s + "\naantal dagen: " + aantalDagen + " en dat kost " + TotaalPrijs(getGehuurdeAuto());
        }



        return s;
    }
}
