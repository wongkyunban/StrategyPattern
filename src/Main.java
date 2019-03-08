import interimpl.FlyByWings;
import interimpl.KingfisherFly;
import subclass.Cuckoo;
import subclass.Kingfisher;
import superclass.Bird;

public class Main {

    public static void main(String[] args) {
        Cuckoo  cuckoo = new Cuckoo();
        cuckoo.setFlyBehavior(new FlyByWings());
        cuckoo.performFly();

        Kingfisher kingfisher = new Kingfisher();
        kingfisher.setFlyBehavior(new KingfisherFly());
        kingfisher.performFly();
    }
}
