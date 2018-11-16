package SampleFactory.Noodle;

public class SampleFactory {

    private static Noodles noodles;

    public static Noodles getNoodles(Integer num){

        switch (num){
            case 1: noodles = new FangbianNoodles(); break;
            case 2: noodles = new GuaNoodles(); break;
            default: noodles = new SampleNoodles();
        }

        return noodles;

    }

}
