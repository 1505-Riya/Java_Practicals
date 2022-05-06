import java.util.Scanner;

public class OOP_12 {
    //Write a program that creates and initializes a four element byte array. Calculate and display the average of its values.
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        byte size=sc.nextByte();
        byte number[]=new byte[size];

        //input-add values to array
        for (int i=0;i<size;i++){
            number[i]=sc.nextByte();
        }
        //output - this prints 0
        for (int i=0;i<size;i++){
            sum = sum + number[i];
        }
        int avg = (sum/size);
        Float D = Float.valueOf(avg);
        System.out.println(sum);
        System.out.println(D);


    }
}
