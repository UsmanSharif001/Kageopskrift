public class Ingrediens {

    // attributter
    private String ingrediens;
    private double mængde;
    private String enhed;
    private int oprindeligAntalPersoner = 4;
    private double kcal;
    private double vægt;
    private double vægtPrEnhed;
    private double beregnMængde;
    private int antal;
    private int antalIngredienser = 7;

    //konsturktøre

    public Ingrediens(String ingrediens, double mængde, String enhed, double kcal) {
        this.ingrediens = ingrediens;
        this.mængde = mængde;
        this.enhed = enhed;
        this.kcal = kcal;
        this.vægt = mængde;
    }

    public Ingrediens(String ingrediens, double mængde, String enhed, double vægt, double kcal) {
        this.ingrediens = ingrediens;
        this.mængde = mængde;
        this.enhed = enhed;
        this.kcal = kcal;
        this.vægt = vægt;
    }
    //get metoder

    public String getIngrediens() {
        return ingrediens;
    }

    public double getMængde() {
        return mængde;
    }

    public String getEnhed() {
        return enhed;
    }

    public double getKcal() {
        return kcal;
    }

    public int getAntal() {
        return antal;
    }

    public double getVægt() {
        return vægt;
    }

    public int getAntalIngredienser() {
        return antalIngredienser;
    }

    //set metode

    public void setAntal(int antal) {
        this.antal = antal;
    }

    //metode

    public double beregnMængde() {
        return mængde * antal / oprindeligAntalPersoner;
    }

    public double beregnVægt() {
        return vægt * antal / oprindeligAntalPersoner;
    }

    public double beregnKcal() {
        return kcal * antal / oprindeligAntalPersoner;
    }

    public String toString() {
        String print = "";
        print = ingrediens + ": " + beregnMængde() + " " + enhed + " " + beregnKcal() + " " + "kcal";
        return print;
    }


}