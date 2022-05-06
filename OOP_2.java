import java.util.Scanner;
//number is odd or even
public class OOP_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if (n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
