public class OOP_10 {
        //Write an application that generates the first 15 numbers in the Fibonacci series.
        public static void main(String[] args) {
                int n=15,firstTerm=0,secondTerm=1;
                System.out.println(n+"terms: ");

                for (int i=1;i<=n;++i){
                        System.out.print(firstTerm+", ");
                        //compute next term
                        int nextTerm=firstTerm+secondTerm;
                        firstTerm=secondTerm;
                        secondTerm=nextTerm;
                }
        }
}
