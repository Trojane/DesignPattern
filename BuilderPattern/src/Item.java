public interface Item {

    public String name();
    public Packing packing();
    public float price();

}

class Burger implements Item{

    @Override
    public String name() {
        return "Burger";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 15.8f;
    }
}

class Cola implements Item{

    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float price() {
        return 3.0f;
    }
}

class VegetableBurger implements Item{

    @Override
    public String name() {
        return "VegetableBurger";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 10.0f;
    }
}