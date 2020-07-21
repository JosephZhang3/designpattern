package singleton;

/**
 * 双重检验锁
 *
 * @author jianghao.zhang
 */
public class DoubleValidateSingleton {
    // volatile 关键字目的：保证 instance 域值对所有线程可见
    private volatile static DoubleValidateSingleton instance;

    public static DoubleValidateSingleton getInstance() {
        if (instance == null) {// 只有 instance 域为null才有必要进入同步
            synchronized (DoubleValidateSingleton.class) {
                if (instance == null) {
                    instance = new DoubleValidateSingleton();
                }
            }
        }
        return instance;
    }

}
