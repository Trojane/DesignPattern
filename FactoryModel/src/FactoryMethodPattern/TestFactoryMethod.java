package FactoryMethodPattern;

import java.util.ArrayList;
import java.util.List;

public class TestFactoryMethod {

    public static void main(String[] args) {

        List<NoodlesFactory> factoryList = new ArrayList<>();
        factoryList.add(new FangbianNoodlesFactory());
        factoryList.add(new GuaNoodlesFactory());
        factoryList.add(new SampleNoodlesFactory());

        for(NoodlesFactory factory:factoryList){
            factory.getNoodles().price();
        }


    }

}
