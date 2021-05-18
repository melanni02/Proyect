public class Trapecio extends Cuadrilatero{
    private double areaT;
    private double altura;

    public Trapecio(int x, int y) {
        super(x, y);
        areaT=(x+y)*altura/2;
        System.out.println("El area del trapecio es: "+areaT);
    }

    public double getAreaT() {
        return areaT;
    }

    public void setAreaT(double areaT) {
        this.areaT = areaT;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void setArea(double area) {
        super.setArea(area);
    }
}
