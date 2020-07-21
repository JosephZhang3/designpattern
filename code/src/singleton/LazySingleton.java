package singleton;

public class LazySingleton {

    private static LazySingleton instance;

    public static LazySingleton getLazySingleton() {
        /**
         * 发现 null 时，才 new 出一个实例
         */
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

}
