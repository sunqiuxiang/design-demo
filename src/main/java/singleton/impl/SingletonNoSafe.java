package singleton.impl;

/**
 * 懒汉式（线程不安全）
 * <p>
 * 这种实现方式不支持多线程
 *
 * @author sunqiuxiang
 * @date 2020-04-22
 */
public class SingletonNoSafe {
    private static SingletonNoSafe instance;

    private SingletonNoSafe() {
    }

    public static SingletonNoSafe getInstance() {
        if (instance == null) {
            instance = new SingletonNoSafe();
        }
        return instance;
    }
}