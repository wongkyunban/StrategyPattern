package superclass;

import inter.FlyBehavior;
import inter.TweetBehavior;

public abstract class Bird {
    private String name;
    private FlyBehavior flyBehavior;
    private TweetBehavior tweetBehavior;
    protected abstract void display();
    public void tweet(){
        System.out.println("tweet tweet");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void performFly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }

    public void performTweet(){
        if(tweetBehavior != null){
            tweetBehavior.tweet();
        }
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public TweetBehavior getTweetBehavior() {
        return tweetBehavior;
    }

    public void setTweetBehavior(TweetBehavior tweetBehavior) {
        this.tweetBehavior = tweetBehavior;
    }
}
