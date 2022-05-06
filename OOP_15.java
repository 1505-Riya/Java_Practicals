public class OOP_15 {
    //Write a program that will create two strings using new keyword, compare them and show true if they are same, append second to first.
    public static void main(String[] args) {
        String str1 = new String("Riya");
        String str2= new String("Riya");
        if (str1.compareTo(str2)==0) {
            System.out.println("Equal");
        }
        System.out.println(str1 + " " +str2);
    }
}
