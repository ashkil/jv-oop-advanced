package core.basesyntax;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String draw() {
        return ("Figure: rectangle, area: " + getArea() + " sq.units, sideA: "
            + sideA + " units, sideB: " + sideB + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}