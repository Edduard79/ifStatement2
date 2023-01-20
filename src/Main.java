public class Main {
    public static void main(String[] args) {


        String mySurname = "Paolini";
        String mySurname2 = "Rossi";


        //variable = (condition) ? expressionTrue :  expressionFalse;

        System.out.println(mySurname + " Your surname " + (mySurname.contains("ni") ? "CONTAINS" : "DOES NOT CONTAIN") + " the sequence of letters 'ni'");

        System.out.println(mySurname2 + " Your surname "  + (mySurname2.contains("ni") ? "contains" : "doesn't contain") + " the sequence of letters 'ni'");


    }
}