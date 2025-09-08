package lab1;

public class Multiples {
    public static void main(String[] args) {
        int multiple = multiples(1000,4,5);
        System.out.println(multiple);
    }

     public static int multiples(int n, int a, int b) {
        int counter = 0;
        for (int i = 1; i < n ;i++) {
           boolean divisibleBy3 = i % a == 0;
           boolean divisibleBy5 = i % b == 0;

           if (divisibleBy3 || divisibleBy5) {
               counter++;
           }


        }
        return counter;
    }

    public static int multiples(){
        return multiples(1000,3,5);
    }

}
