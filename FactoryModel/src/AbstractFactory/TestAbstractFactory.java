package AbstractFactory;

public class TestAbstractFactory {

    public static void main(String[] args) {


        /*Factory asusFactory = new AsusFactory();
        Factory dellFactory = new DellFactory();

        Mouse asusFactoryMouse = asusFactory.createMouse();
        Keyboard asusFactoryKeyboard = asusFactory.createKeyboard();

        Mouse dellFactoryMouse = dellFactory.createMouse();
        Keyboard dellFactoryKeyboard = dellFactory.createKeyboard();

        asusFactoryKeyboard.iskeyBoad();
        asusFactoryMouse.isMouse();
        dellFactoryKeyboard.iskeyBoad();
        dellFactoryMouse.isMouse();*/

        Factory asus = FactoryCreater.ChooseFactory("Dell");
        Keyboard keyboard = asus.createKeyboard();
        keyboard.iskeyBoad();

        Factory factory = FactoryCreater.ChooseFactory("DELL");
        Mouse mouse = factory.createMouse();
        mouse.isMouse();


    }

}
