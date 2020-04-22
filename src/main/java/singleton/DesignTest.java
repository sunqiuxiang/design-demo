package singleton;

/**
 * @author sunqiuxiang
 * @date 2020-04-22 21:55
 */
public class DesignTest {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.test();
    }
}
