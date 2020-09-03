package simplefactory;

public class DoEat {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();

        Fruit apple = factory.create("apple");
        Fruit lemon = factory.create("lemon");

        apple.watch();
        apple.eat();

        lemon.watch();
        lemon.eat();

        Fruit unknown = factory.create("anyway");
        unknown.watch();
        unknown.eat();
    }
}
