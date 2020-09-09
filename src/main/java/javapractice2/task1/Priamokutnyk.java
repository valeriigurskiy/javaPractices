package task1;

public class Priamokutnyk implements Square{
    private double sideA;
    private double sideB;

    @Override
    public String toString() {
        return "Priamokutnyk{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    public Priamokutnyk(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void square() {
        double resultByMultiply = sideA * sideB;
//        String result = String.format("%8.1f", resultByMultiply).replace(',','.');
        System.out.println(resultByMultiply);
    }
}
