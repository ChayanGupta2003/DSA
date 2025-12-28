public class armstrongNumber
{
    static int count = 0;

    public static int countDigit(int n)
    {
        if (n == 0)
            return 0;
        else
            return 1 + countDigit(n / 10);
    }

    public static void main(String[] args)
    {
        int n = 153;

        // 👉 PROPER: store the digit count in 'count'
        count = countDigit(n);

        int data = recursiveArmstrong(n);
        System.out.println("Sum of powered digits = " + data);

        if (data == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }

    public static int recursiveArmstrong(int n)
    {
        if (n == 0)
            return 0;

        int digit = n % 10;  // 👉 last digit
        return (int)Math.pow(digit, count) + recursiveArmstrong(n / 10);
    }
}
