public class Cuadrado extends Cuadrilatero{

    private double areaR;

    public Cuadrado(int x, int y) {
        super(x, y);

        areaR=x*y;
        System.out.println("El area del cuadrado es: "+areaR);
    }

    public double getAreaR() {
        return areaR;
    }

    public void setAreaR(double areaR) {
        this.areaR = areaR;
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

