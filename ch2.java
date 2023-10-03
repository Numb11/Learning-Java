import java.util.*;

public class ch2 {
    public static void main(String[] args){
        //Variables

        byte x = 10; //Range of -+128
        short y = 32760; //Small int range -+32768
        int z = 2147483647; //Integer range is big
        long a = 32312842; //Very large range
        float b = 7.3839f; //Any rational umber withon the given range
        double c = 1.64553; //Very large real numbers
        char d = 'f'; //A sing character
        boolean e = true; // Boolean

        //Constant
        final int CON = 3;
        //Final initialises a variable as a constant that cannot be changed by the program at run time it is private
        //Static/Dynamic means that the memory size allocation of the variable is fixed therefore can not be changed
        System.out.println("Enter a number;");
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        input.close();


    }
}
