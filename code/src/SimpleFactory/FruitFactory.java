package SimpleFactory;

public class FruitFactory {

    Fruit create(String type) {
        switch (type) {
            case "apple":
                return new Apple();
            case "lemon":
                return new Lemon();
            default:
                throw new IllegalArgumentException("Fruit not exist");
        }
    }
}
