package singleton.impl;

/**
 * 枚举
 *
 * @author sunqiuxiang
 * @date 2020-04-22
 */
public class SingletonEnum {
    private SingletonEnum() {
    }

    public static SingletonEnum getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton {
        // 实例
        INSTANCE;

        private SingletonEnum singleton;

        /**
         * JVM会保证此方法绝对只调用一次
         */
        private Singleton() {
            singleton = new SingletonEnum();
        }

        public SingletonEnum getInstance() {
            return singleton;
        }
    }
}