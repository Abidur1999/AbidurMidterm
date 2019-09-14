package math.problems;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        public static void testFactorialRecursive(); {
            System.out.println("Testing factorialRecursive method:");
            assertEquals(1, Factorial.factorialRecursive(1));
            assertEquals(120, Factorial.factorialRecursive(5));
            assertEquals(720, Factorial.factorialRecursive(6));
        }

        public void testFactorialIterative() {
            System.out.println("Testing factorialIterative method:");
            assertEquals(1, Factorial.factorialIterative(1));
            assertEquals(120, Factorial.factorialIterative(5));
            assertEquals(720, Factorial.factorialIterative(6));
        }

        public void Fibonacci() {
            System.out.println("Testing Fibonacci method:");
            assertEquals(5, Fibonacci.Fib(5));
            assertEquals(55, Fibonacci.Fib(10));
            assertEquals(610, Fibonacci.Fib(15));
        }


        public void FindMissing() {

            int [] array1 = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
            int [] array2 = new int[]{5, 1, 2, 3};

            System.out.println("Testing FindMissing method:");
            assertEquals(9, FindMissingNumber.FindMissing(array1));
            assertEquals(4, FindMissingNumber.FindMissing(array2));
        }

    }
}
