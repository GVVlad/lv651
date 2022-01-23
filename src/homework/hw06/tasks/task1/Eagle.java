package homework.hw06.tasks.task1;

public class Eagle extends FlyingBird{

    public Eagle() {
        super(true, true);
    }

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                " have feathers = " + feathers +
                ", lay eggs = " + layEggs +
                '}';
    }
}