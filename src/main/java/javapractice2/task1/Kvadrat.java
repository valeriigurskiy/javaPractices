package task1;

public class Kvadrat implements Square {
    private double sideA;

    @Override
    public String toString() {
        return "Kvadrat{" +
                "sideA=" + sideA +
                '}';
    }

    public Kvadrat(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public void square() {
        double resultByMultiply = sideA * sideA;
//        String result = String.format("%8.1f", resultByMultiply).replace(',', '.');
        System.out.println(resultByMultiply);
    }
}
