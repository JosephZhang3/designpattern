package simplefactory;

public class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("What you are EATing is apple, sweat and crisp !");
    }

    @Override
    public void watch() {
        System.out.println("What you are WATCHing is apple, red or green .");
    }
}
