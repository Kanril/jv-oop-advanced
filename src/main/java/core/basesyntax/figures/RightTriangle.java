package core.basesyntax.figures;

import core.basesyntax.util.Colors;

public class RightTriangle extends Figure {
    private int kat;
    private int kat1;

    public RightTriangle(Colors color) {
        super(color);
        this.kat = getRandomNum();
        this.kat1 = getRandomNum();
    }

    @Override
    public double getArea() {
        return this.kat * kat1 / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + getArea()
                + " sq. units, " + " side a: " + kat
                + " side b: " + kat1 + " units, color: " + getColor());
    }
}
