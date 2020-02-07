import java.util.Scanner;

public class AreaPerimeter
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter length of the rectangle: ");
		double length = kb.nextDouble();
		System.out.print("Enter width of the rectangle: ");
		double width = kb.nextDouble();
		double area = length * width;
		double perimeter =  (2 * length) + (2 * width);
		System.out.printf("\nArea of the rectangle is: %.2f", area);
		System.out.printf("\nPerimeter of the rectangle is: %.2f\n", perimeter);
	}
}