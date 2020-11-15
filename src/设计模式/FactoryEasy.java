package 设计模式;

/**
 * @ClassName FactoryEasy
 * @Description TODO 简单工厂模式
 * @Author changxueyi
 * @Date 2020/10/11 20:47
 */
public class FactoryEasy {
    public static Product createProduct(String type) {
        if (type.equals("A"))
            return new ProductA();
        else
            return new ProductB();
    }

    public static void main(String[] args) {
        Product product = FactoryEasy.createProduct("A");
        product.print();
    }
}

abstract class Product {
    public abstract void print();
}

class ProductA extends Product {
    @Override
    public void print() {
        System.out.println("产品A");
    }
}

class ProductB extends Product {
    @Override
    public void print() {
        System.out.println("产品B");
    }
}