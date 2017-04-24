/**
 * Created by IceBreakers on 1/28/17. Class 1 HW-1
 * "Write a program that prints the numbers from start number to end number.
 * if start or end is negative return Bye. If start > end, return Tata
 * But for multiples of three print “Fizz” instead of the number
 * and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”."
 * Write the output in a file
 */
public class FizzBuzz {
    private static void fizz(int start, int end){
        //Write your code here
    }

    private static void testBench(){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        System.out.println("########## START-1 END-10 ###############");
        fizz(1,10);
        System.out.println("############################");
        System.out.println("########## START- -1 END-0 ###############");
        fizz(-1,0);
        System.out.println("############################");
        System.out.println("########## START-1 END-100 ###############");
        fizz(1,100);
        System.out.println("############################");
        System.out.println("########## START-1000 END-1999 ###############");
        fizz(1000,1999);
        System.out.println("############################");
        System.out.println("########## START-100 END-1 ###############");
        fizz(100,1);
        System.out.println("############################");
    }

    public static void main(String args[]){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        System.out.println("FizzBuzz.java");
        testBench();
        System.out.println("DONE");
    }
}
