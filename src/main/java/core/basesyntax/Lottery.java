package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().toString();
        int number = new Random().nextInt(100);
        return new Ball(color, number);
    }
}
