package singleton.impl;

/**
 * 懒汉式（线程安全）
 * <p>
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 *
 * @author sunqiuxiang
 * @date 2020-04-22
 */
public class SingletonSafe {
    private static SingletonSafe instance;

    private SingletonSafe() {
    }

    public static synchronized SingletonSafe getInstance() {
        if (instance == null) {
            instance = new SingletonSafe();
        }
        return instance;
    }
}