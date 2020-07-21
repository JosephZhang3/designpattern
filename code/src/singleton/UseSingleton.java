package singleton;

public class UseSingleton {
    public static void main(String[] args) {
        EnumSingleton s = EnumSingleton.INSTANCE;
        System.out.println(System.identityHashCode(s));

        EnumSingleton s2 = EnumSingleton.INSTANCE;
        System.out.println(System.identityHashCode(s2));
        /**
         * s 和 s2 的内存地址一样，说明用枚举实现单例模式生效
         */

        StaticInnerClazzSingleton s3 = StaticInnerClazzSingleton.getInstance();
        StaticInnerClazzSingleton s4 = StaticInnerClazzSingleton.getInstance();
        System.out.println(s3 == s4);
        /**
         * s3 和 s4 的内存地址一样，说明用静态内部类实现单例模式生效
         */

    }
}
