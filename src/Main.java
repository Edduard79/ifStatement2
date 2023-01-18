public class Main {
    public static void main(String[] args) {


        String mySurname = "Paolini";
        String mySurname2 = "Rossi";
        String var1, var2;

        //variable = (condition) ? expressionTrue :  expressionFalse;

        var1 =(mySurname.contains("ni")) ? "Your surname contains the sequence of letters 'ni'!" : "Your surname doesn't contain] the sequence of letters 'ni'!";
        System.out.println(mySurname + " " + var1);

        var2 =(mySurname2.contains("ni")) ? "Your surname contains the sequence of letters 'ni'!" : "Your surname doesn't contain] the sequence of letters 'ni'!";
        System.out.println(mySurname2 + " " + var2);

    }
}