
public class OOP_3 {
    //Write a program that displays the value of 2 raised to the power 12.
    public static void main(String[] args) {
        int base=2;
        int exponent=12;
        int result=1;
        while (exponent!=0){
            result=result*base;
            --exponent;
        }
        System.out.println("Answer = "+result);
    }
}
