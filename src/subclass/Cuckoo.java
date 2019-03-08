package subclass;

import superclass.Bird;

public class Cuckoo extends Bird {

    @Override
    protected void display() {
        System.out.print("I am a cuckoo!");
    }
}
