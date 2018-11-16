package AbstractFactory;

public interface Keyboard {

    void iskeyBoad();

}

class DellKeyboard implements Keyboard{

    @Override
    public void iskeyBoad() {
        System.out.println("This is the Dell Keyboard");
    }
}

class AsusKeyboard implements Keyboard{

    @Override
    public void iskeyBoad() {
        System.out.println("This is the Asus Keyboard");
    }
}