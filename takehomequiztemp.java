import java.util.Scanner;

public class takehomequiztemp// implements sumInterface
{
	public takehomequiztemp()
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Num 2: ");
        int num2 = scanner.nextInt();

        sumInterface rangeSum = (a, b) -> {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        };

        int sum = rangeSum.sumOfRange(num1, num2);

        System.out.println("Sum: " + sum);
    }

	public static void main(String[] args)
	{
		takehomequiztemp app = new takehomequiztemp();
	}

}