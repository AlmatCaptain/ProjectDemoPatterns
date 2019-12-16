package Strategy;

import Strategy.Strategy;

public class Back implements Strategy {
    @Override
    public void doTrain(String name) {
        System.out.println(name+" began back training!");
    }
}
