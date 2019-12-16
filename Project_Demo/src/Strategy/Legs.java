package Strategy;

import Strategy.Strategy;

public class Legs implements Strategy {

    @Override
    public void doTrain(String name) {
        System.out.println(name + " began legs training!");
    }
}
