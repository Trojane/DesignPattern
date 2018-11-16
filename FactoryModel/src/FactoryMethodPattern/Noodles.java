package FactoryMethodPattern;

public interface Noodles {

    void price();

}

class FangbianNoodles implements Noodles {

    @Override
    public void price() {
        System.out.println("方便面涨价了");
    }
}

class GuaNoodles implements Noodles {

    @Override
    public void price() {
        System.out.println("不喜欢吃挂面下次不吃了");
    }
}

class SampleNoodles implements Noodles {

    @Override
    public void price() {
        System.out.println("普通的面条普通的味道");
    }
}
