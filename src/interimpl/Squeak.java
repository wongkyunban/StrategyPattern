package interimpl;

import inter.TweetBehavior;

public class Squeak implements TweetBehavior {
    @Override
    public void tweet() {
        System.out.print("squeak squeak");
    }
}
