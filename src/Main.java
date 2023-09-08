import java.util.Scanner;

public class Main {
    private Recipe recipe;
    public static void main(String[] args) {
        Main recipeApp = new Main();
        recipeApp.start();
    }

    public void start(){
            printStartMessage();
            setNumberOfPersons();
            printIngredients();
            printWeightAndEnergy();
            printAverageAndTotalWeightAndEnergy();
     }

    public void printStartMessage(){
            System.out.println("Goddag og velkommen til ølkage opskrift\nHvor mange personer er kagen til? ");
     }

        public void setNumberOfPersons() {
        Scanner keyboard = new Scanner(System.in);
        int antalPersoner = keyboard.nextInt();
        recipe = new Recipe("Ølkage", antalPersoner);
        recipe.setAntal(antalPersoner);
        System.out.println("Til " + antalPersoner + " personner " + "skal der bruges følgende mængde: ");
     }

        public void printIngredients() {
            for (Ingrediens ingrediens : recipe.getOpskrift()) {
                System.out.println(ingrediens);
            }
        }

        public void printWeightAndEnergy() {

            System.out.printf("\u2500".repeat(50) + "%nVægten er %.2f g og kcal inholdet er %.2f kcal \n", recipe.regnVægt(),recipe.regnKcal());
        }

        public  void printAverageAndTotalWeightAndEnergy(){
            System.out.printf("\u2500".repeat(50)+ "%nGns vægt er %.2fg og gns kcal er %.2fkcal%n " +"\u2500".repeat(50),recipe.regnGnsVægt(),recipe.regnGnsKcal());
        }


}
