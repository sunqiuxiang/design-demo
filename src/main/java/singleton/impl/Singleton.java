package singleton.impl;

/**
 * 静态内部类
 * <p>
 * 这种方式同样利用了 classloader 机制来保证初始化 instance 时只有一个线程
 * SingletonHungry2 类被装载了，instance 不一定被初始化。
 * 因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。
 *
 * @author sunqiuxiang
 * @date 220-04-22
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}