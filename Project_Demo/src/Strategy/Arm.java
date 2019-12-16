package Strategy;

import Strategy.Strategy;

public class Arm implements Strategy {
    @Override
    public void doTrain(String name) {
        System.out.println(name + " began arm training!!!");
    }
}
