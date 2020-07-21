package singleton;

public class HungerSingleton {
    /**
     * 加载类时 new 出一个实例
     */
    private static HungerSingleton instance = new HungerSingleton();

    public static HungerSingleton getInstance() {
        return instance;
    }
}
