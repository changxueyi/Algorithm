package 设计模式.抽象工厂模式;

public interface AbstractFactory {
    Phone createPhone(String param);
    Mask createMask(String mask);
}
