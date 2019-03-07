public class BasicSyntax //this is to document basic syntax for beginners; can also be a reminder
    // *** also using /* (comments) */ can comment out multiple blocks instead of
        // repeating double back slash '//' this is call multiline comment

    /* For now you must end all statements with ';' semi colons.
        after learning what a parameters is some syntax won't need semi colons to end a statement
        --This " "; this is for putting syntax in a string ie "Hello", it will print what ever is in the quotation marks
        i.e when printing a statement "Hello my name is" will only print whats in it. Putting varibles in it will just
        print the varible; to print the varible out you need to type the varible out of the quotation.
        i.e  "Hello my name is " + (varible); ... you also need to include a '+' sign to include it.

    */


/*{
   public static void main(String[] args) //You need a method in a class to execute a program
            //This is a method; learning from start ..
                        // knowing what a method is for  now won't matter; focus is learning basic commands;
   {
       // double blackslash is for comments ie '//'( follow by comments)
       //ie  >>> //hi
       //uses of comment syntax will negate any codes after the command0
//This will be a basic command for a printing an output
       System.out.println("Hello"); //This will output the string inside the (....)

   }
}This is simple program to output a string */

{ //This will introduce types(int, double, boolean, char)
    public static void main(String[] args)
    {
        int gallon = 1; //using int you can only use whole numbers not decimal when using int
        double liters = 3.7854; //  using double you can use decimal numbers
        char ch = 71; // giving character a number value( from 1- 127) will give its ASCII value ie 71 is G
                        // so here I will use G to represent gallon to spit a output
        char ch2 = 76;// this will be used for liters
        boolean sky; // this will be used for a true or false application
                sky = true;
        System.out.println(gallon+ " "+ ch  + " is " + liters + " " + ch2 + " !");
        System.out.println("Is the sky blue?\n\t " + sky);
    }
}
