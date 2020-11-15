package 设计模式;

/**
 * @ClassName CXFactory
 * @Description TODO 抽象工厂模式
 * @Author changxueyi
 * @Date 2020/10/11 20:52
 */
public class CXFactory {
    //抽象工厂
    interface AbstractFactory {
        Phone createPhone(String param);
        Mask createMask(String param);
    }

    //具体工厂
    class SuperFactory implements AbstractFactory{
        @Override
        public Phone createPhone(String param) {
            return new iphone();
        }

        @Override
        public Mask createMask(String param) {
            return new N95();
        }
    }

}

//产品大类--手机
interface Phone{}
class iphone implements Phone{}


//产品大类--口罩
interface Mask{}
class N95 implements Mask{}