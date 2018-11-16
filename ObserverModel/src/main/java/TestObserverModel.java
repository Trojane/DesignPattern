import java.util.Observable;
import java.util.Observer;

public class TestObserverModel{
    public static void main(String[] args) {

        //
        ProductList productList = ProductList.getInstance();

        productList.addObserver(new JingDongObserver());
        productList.addObserver(new TmallObserver());

        for(int i=0; i<10; i++){
            try {
                Thread.sleep(1500);
                productList.addProduct("Product "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class JingDongObserver implements Observer {
    public void update(Observable o, Object arg) {

        System.out.println("京东添加商品：" + arg);

    }

}

class TmallObserver implements Observer {
    public void update(Observable o, Object arg) {

        System.out.println("天猫添加商品：" + arg);

    }
}
