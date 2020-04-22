package singleton.impl;


/**
 * 饿汉式（线程安全）
 * <p>
 * 优点：不加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 *
 * @author sunqiuxiang
 * @date 2020-04-22
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}