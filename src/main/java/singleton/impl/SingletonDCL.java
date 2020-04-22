package singleton.impl;

/**
 * 双重校验锁
 * <p>
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 *
 * @author sunqiuxiang
 * @date 2020-04-22
 */
public class SingletonDCL {
    private volatile static SingletonDCL singleton;

    private SingletonDCL() {
    }

    public static SingletonDCL getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDCL.class) {
                if (singleton == null) {
                    singleton = new SingletonDCL();
                }
            }
        }
        return singleton;
    }
}