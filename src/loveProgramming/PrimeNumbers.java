package loveProgramming;
//The number which are divided by itself or by 1 eg:3,7,11,13
    public class PrimeNumbers {
    public static void main(String[] args) {
        int num=13;
        boolean prime=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }
        if(prime==false)
            System.out.println("Number is not prime");
        else
            System.out.println("Number is prime");
    }
}
