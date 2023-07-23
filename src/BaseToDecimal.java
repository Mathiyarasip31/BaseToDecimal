import java.util.Scanner;

public class BaseToDecimal {
    static void conversion(String number,int base)
    {
        int sum=0;
        int res=0;
        int len=number.length();
        for (int i=0;i<len;i++)
        {
            res=Integer.parseInt(String.valueOf(number.charAt(len-i-1)));
            sum+=res*Math.pow(base,i);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number=scanner.next();
        int base=scanner.nextInt();
        conversion(number,base);
    }
}