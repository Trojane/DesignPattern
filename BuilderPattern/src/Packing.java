public interface Packing {

    public String Pack();

}

class Bottle implements Packing{

    @Override
    public String Pack() {

        return "Bottle";

    }
}

class Wrapper implements Packing{

    @Override
    public String Pack() {
        return "Wrapper";
    }
}