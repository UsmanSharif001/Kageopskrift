import java.util.Scanner;

public class Main {
    private Recipe recipe;

    public static void main(String[] args) {
        Main recipeApp = new Main();
        recipeApp.start();
    }

    public void start() {
        printStartMessage();
        setNumberOfPersons();
        printIngrediens();
        printWeightAndEnergy();
        printAverageAndTotalWeightAndEnergy();

    }

    public void printStartMessage() {
        System.out.print("Goddag og velkommen til ølkage opskrift\nHvor mange personer er kagen til? ");
    }


    public void setNumberOfPersons() {
        Scanner keyboard = new Scanner(System.in);
        int antalPersoner = keyboard.nextInt();
        recipe = new Recipe("Ølkage", antalPersoner);
        recipe.setAntal(antalPersoner);
        System.out.println("\u2500".repeat(60) + "\nTil " + antalPersoner + " personner " + "skal der bruges følgende mængde");
    }


    public void printIngrediens() {
        for (Ingrediens ingrediens : recipe.getOpskrift()) {
            System.out.println(ingrediens);
        }
    }

    public void printWeightAndEnergy() {
        System.out.printf("\u2500".repeat(60) + "%nVægten af kagen er: %.2f g og det samlede kcal/KJ er: %.0f kcal / %.0f KJ \n", recipe.regnVægt(), recipe.regnKcal(), recipe.regnKcaltilKJ());
    }

    public void printAverageAndTotalWeightAndEnergy() {
        System.out.printf("\u2500".repeat(60) + "%nGns vægt er: %.2fg og gns kcal/KJ er: %.0f kcal / %.0f KJ%n" + "\u2500".repeat(60), +recipe.regnGnsVægt(), recipe.regnGnsKcal(), recipe.regnGnsKJ());
    }


}