package simplefactory;

public class Lemon implements Fruit {
    @Override
    public void eat() {
        System.out.println("What you are EATing is lemon, sour and juicy !");
    }

    @Override
    public void watch() {
        System.out.println("What you are WATCHing is lemon, yellow .");
    }
}
