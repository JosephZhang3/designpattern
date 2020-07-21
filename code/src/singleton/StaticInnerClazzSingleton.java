package singleton;

public class StaticInnerClazzSingleton {
    /**
     * 私有静态类持有一个私有静态域，这么记忆
     */
    private static class InnerClazz {
        private static StaticInnerClazzSingleton instance = new StaticInnerClazzSingleton();
    }

    public static StaticInnerClazzSingleton getInstance() {
        return InnerClazz.instance;
    }
}
