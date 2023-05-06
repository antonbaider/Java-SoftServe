abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean hasFeathers() {
        return feathers;
    }

    public boolean laysEggs() {
        return layEggs;
    }

    public abstract void fly();
}
class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can fly :)");
    }

}
class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }
}
class Eagle extends FlyingBird{
    public Eagle() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("I can fly up to 37,000 feet!");
    }
}

class Swallow extends FlyingBird{
    @Override
    public void fly() {
        System.out.println("I can fly speedy and jump!");

    }

    public Swallow() {
        super(true, true);
    }
}
class Penguin extends NonFlyingBird {
    @Override
    public void fly() {
        System.out.println("I can't fly but can jump!");

    }

    public Penguin() {
        super(true, true);
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super(false, true);
    }
    @Override
    public void fly() {
        System.out.println("I can't fly but can jump!");

    }
}
public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[] {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };

        for (Bird bird : birds) {
            System.out.println("The bird " + bird.toString() + " has feathers: " + bird.hasFeathers() + ", lays eggs: " + bird.laysEggs());
            bird.fly();
        }
    }
}
