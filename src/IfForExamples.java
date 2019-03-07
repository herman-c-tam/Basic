public class IfForExamples
{
    public static void main(String[] args) // we will start with IF example
            // template if(condition) statement;
    {
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

    }
}
