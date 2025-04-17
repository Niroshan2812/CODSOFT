package Task_1;

import java.util.Random;

public class NumberGenerator {
    private final int min;
    private final int max;
    private final Random random;

    public NumberGenerator(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    public int generate(){
        return random.nextInt(max-min+1)+min;
    }
}
