package interimpl;

import inter.FlyBehavior;

public class KingfisherFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("This is my special way of flying!!!");
    }
}
