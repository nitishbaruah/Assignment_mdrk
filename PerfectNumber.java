import java.util.Scanner;

public class PerfectNumber
{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.print(perfectNum(num));
    }
    public static boolean perfectNum(int num){
        //int temp=num;
        int divisorSum=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0) divisorSum+=i;
        }
        return num==divisorSum;
    }

}
