package 设计模式.抽象工厂模式;

/**
 * @ClassName SuperFactory
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/10/27 16:28
 */
public class SuperFactory implements AbstractFactory {
    @Override
    public Phone createPhone(String param) {
        return new iphone();
    }

    @Override
    public Mask createMask(String mask) {
        return new N95();
    }
}