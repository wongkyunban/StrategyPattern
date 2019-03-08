package subclass;

import superclass.Bird;

public class Kingfisher extends Bird {

    @Override
    protected void display() {
        System.out.print("I am a kingfisher!");
    }
}
