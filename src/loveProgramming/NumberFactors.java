package loveProgramming;

public class NumberFactors {
    public static void main(String[] args) {
        int num=5;
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact=fact*i;
//            2!=2*1
//            3!=3*2*1
//            4!=4*3*2*1
        }
        System.out.println(fact);
    }

}
