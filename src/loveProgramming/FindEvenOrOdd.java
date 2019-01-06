package loveProgramming;

public class FindEvenOrOdd {
    public static void main(String[] args) {
        int number,rem;
        number=10;
        rem=number%2;
        if(rem==0)
            System.out.println("Number is even:"+number);
        else
            System.out.println("Number is odd:"+number);
    }
}
