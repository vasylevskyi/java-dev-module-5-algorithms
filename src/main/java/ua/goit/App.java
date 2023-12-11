package ua.goit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        int[] memoisation = new int[7];

        FibonachiLogic fibonachiNumber = new FibonachiLogic();
        //Fibonachi Iteration
        System.out.println("fibonachiIteration = " + fibonachiNumber.fibonachiIteration(6));

        //Fibonachi Recursion
        System.out.println("fibonachiRecursion = " + fibonachiNumber.fibonachiRecursion(6));

        //Fibonachi Dynamic Programming
        System.out.println("fibonachiDynamicProgramming = " + fibonachiNumber.fibonachiDynamicProgramming(6
                , memoisation));
    }
}
