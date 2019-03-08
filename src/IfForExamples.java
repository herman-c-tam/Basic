public class IfForExamples
{
    public static void main(String[] args) // we will start with IF example
            // template if(condition) statement;
   /* {
        int a = 2, b = 3, c;

        if (a<b) // if statement don't need semicolons because it is in a paramenter
            //if(a>b) will not print the statement because it is false
            System.out.println(a+ " is less then " + b); // this will only print if statement is true

        if( a == b) // this will not print because it is not true
            System.out.println(a + " is equal to " + b);

        System.out.println(); // this will make a line for next  output

        c = a-b; //prevously we did not give 'c' a value
        System.out.println("c contains -1"); // this we state the answer
        if(c>=0) System.out.println("c is a non negative"); // this will not print because a-b is 2-3 which is -1
            //if we switch the values of a and b or the order of operation it might be true
        if(c<0) System.out.println("c is negative\n"); //this will print because statement is true

        c = b-a; // now c is 3-2 which is 1
        System.out.println("c contains 1");
        if(c>=0) System.out.println("c is a non negative");
        if(c<0) System.out.println("c is negative\t\n");

    }*/

    /*{ // this will be a for loop
        int count; //we will use count to have a better grasp of the concept
        for(count =0; count <5; count++) // count will start at zero, and if its less then 5, it will add it self
            //and repeat until it reaches the boolean statement count < 5
            //count will stop once reaching 4
        System.out.println("Count of: "+ count);

        System.out.println("Finally!!");

    }*/
    { //This will be another if with blocks of codes
        double a,b,c; //we will use the first two varbles for now;we will use double incase hou want to try decimal
        a=2;
        b=4;
        if(a !=0)
        {//This is the beginnig of the block; anything in this block will reflect on the if statement
            System.out.println("a and zero are not as one!!!");
            c = b /a ; //now we will use the third varible we didn't use yet
            System.out.println("b divided a is "+ c);
        }

    }
}
