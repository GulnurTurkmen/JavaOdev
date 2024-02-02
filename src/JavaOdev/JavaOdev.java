package JavaOdev;
import java.util.Scanner;

public class JavaOdev {
public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	System.out.print("metre cinsinden boy girin:");
	double boy = inp.nextDouble();
	System.out.print("kilonuzu girin:");
	double kilo = inp.nextDouble();
	double vkindeks = kilo/(boy*boy);
	System.out.print("Vücut kitle indeksiniz:" +vkindeks);
}
}
