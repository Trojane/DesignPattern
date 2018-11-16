package AbstractFactory;

public interface Mouse {

    void isMouse();

}

class DellMouse implements Mouse{

    @Override
    public void isMouse() {
        System.out.println("This is the Dell Mouse");
    }
}

class AsusMouse implements Mouse{

    @Override
    public void isMouse() {
        System.out.println("This is the Asus Mouse");
    }
}
