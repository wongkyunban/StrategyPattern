package interimpl;

import inter.FlyBehavior;

public class FlyByWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("I am flying by wings");
    }
}
