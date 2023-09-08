public class Recipe {

    //Attributer
    private double totalVægt;
    private double totalKcal;
    private int antalPersonner;
    private Ingrediens[] opskrift;
    private String navn;

    //Konstruktør
    public Recipe(String navn, int antalPersonner) {
        Ingrediens hvedemel = new Ingrediens("hvedemel", 1000, "gram", 3665);
        Ingrediens puddersukker = new Ingrediens("puddersukker", 1000, "gram", 3800);
        Ingrediens nellike = new Ingrediens("nellike", 2, "tsk", 5.4, 18.09);
        Ingrediens ingefær = new Ingrediens("ingefær", 2, "tsk", 4.4, 1.6);
        Ingrediens kanel = new Ingrediens("kanel", 2, "tsk", 5.4, 12.37);
        Ingrediens natron = new Ingrediens("natron", 2, "tsk", 5.0, 0);
        Ingrediens hvidtøl = new Ingrediens("hvidtøl", 66, "cl", 660, 297);
        opskrift = new Ingrediens[]{hvedemel, puddersukker, nellike, ingefær, kanel, natron, hvidtøl};
        this.navn = navn;
        this.antalPersonner = antalPersonner;
    }


    //get metoder
    public Ingrediens[] getOpskrift() {
        return opskrift;
    }

    public double getTotalVægt() {
        return totalVægt;
    }

    public double getTotalKcal() {
        return totalKcal;
    }


    public void setAntal(int antalPersoner) {
        this.antalPersonner = antalPersoner;
        for (Ingrediens ingrediens : opskrift) {
            ingrediens.setAntal(antalPersoner);
        }
    }


    //beregn total vægt
    public double regnVægt() {
        for (Ingrediens ingrediens : opskrift) {
            totalVægt += ingrediens.beregnVægt();
        }
        return totalVægt;
    }

    //beregn gns vægt
    public double regnGnsVægt() {
        return totalVægt / opskrift.length;
    }

    //beregn total kcal
    public double regnKcal() {
        for (Ingrediens ingrediens : opskrift) {
            totalKcal += ingrediens.beregnKcal();
        }
        return totalKcal;
    }

    //beregn gns kcal

    public double regnGnsKcal() {
        return totalKcal / opskrift.length;
    }

}