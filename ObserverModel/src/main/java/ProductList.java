import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {

    //产品表
    private static List<String> list;

    //产品表对象（被观察者）
    private static ProductList productList;

    /**
     * 单例构造器
      */
    private ProductList(){};

    /**
     * 获取 ProductList单例对象
     * @return
     */
    public static ProductList getInstance(){

        if(productList == null){
            productList = new ProductList();
            list = new ArrayList<String>();
        }

        return productList;

    }


    /**
     * 增加观察者
     * @param observer
     */
    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    /**
     * 增加产品 触发观察者update方法
     * @param product
     */
    public void addProduct(String product){
        list.add(product);
        System.out.println("添加新商品："+product+"成功");
        this.setChanged();
        this.notifyObservers(product);
    }

}
