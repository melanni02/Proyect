import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3,h,aC,aR,aT;

        System.out.println("lado del cuadrado: ");
        x1=sc.nextDouble();
        System.out.println("lado del cuadrado: ");
        y1=sc.nextDouble();

        System.out.println("Base del rectangulo : ");
        x2=sc.nextDouble();
        System.out.println("Altura del rectangulo: ");
        y2=sc.nextDouble();

        System.out.println("Base mayor del trapecio: ");
        x3=sc.nextDouble();
        System.out.println("Base menor del trapecio: ");
        y3=sc.nextDouble();
        System.out.println("Altura del trapecio: ");
        h=sc.nextDouble();

        aC=x1*y1;
        System.out.println("El area del cuadrado es: "+aC);
        aR=x2*y2;
        System.out.println("El area del rectangulo es: "+aR);
        aT=(x3+y3)*h/2;
        System.out.println("El area del trapecio es: "+aT);
    }
}
