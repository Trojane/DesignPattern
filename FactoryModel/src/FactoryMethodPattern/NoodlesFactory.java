package FactoryMethodPattern;


public interface NoodlesFactory {

    Noodles getNoodles();

}


class FangbianNoodlesFactory implements NoodlesFactory{

    @Override
    public Noodles getNoodles() {
        return new FangbianNoodles();
    }
}

class GuaNoodlesFactory implements NoodlesFactory{

    @Override
    public Noodles getNoodles() {
        return new GuaNoodles();
    }
}

class SampleNoodlesFactory implements NoodlesFactory{

    @Override
    public Noodles getNoodles() {
        return new SampleNoodles();
    }
}
