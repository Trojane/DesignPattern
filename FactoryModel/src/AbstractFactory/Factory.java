package AbstractFactory;

public interface Factory {

    Keyboard createKeyboard();

    Mouse createMouse();

}

class DellFactory implements Factory{

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}

class AsusFactory implements Factory{

    @Override
    public Keyboard createKeyboard() {
        return new AsusKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new AsusMouse();
    }
}
