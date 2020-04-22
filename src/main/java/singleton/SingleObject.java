package singleton;

public class SingleObject {

    /**
     * 创建 SingleObject 的一个对象
     */
    private static SingleObject instance = new SingleObject();

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private SingleObject() {
    }

    /**
     * 对外暴露获取实例的方法
     *
     * @return 实例
     */
    public static SingleObject getInstance() {
        return instance;
    }

    public void test() {
        System.out.println("This is single");
    }
}