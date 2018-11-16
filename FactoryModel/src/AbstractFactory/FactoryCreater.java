package AbstractFactory;

public class FactoryCreater {

    public static Factory ChooseFactory(String choice){

        Factory factory = null;

        String s = "AbstractFactory."+choice.substring(0, 1).toUpperCase() + choice.substring(1).toLowerCase() + "Factory";

        try {
            factory =  (Factory) Class.forName(s).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("查询的工厂不存在");
        }


        return factory;

    }

}
