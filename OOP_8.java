import java.util.Scanner;
/*
Write a program that outputs a table of numbers.
 Each line in the table contains three entries: the number, its square, and its cube.
Begin with 1 and end with 10.
 */
public class OOP_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i+" "+i*i+" "+i*i*i);
        }
    }
}
