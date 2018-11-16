public class Test2 extends Test1{

    public Test2(){

        System.out.println("子类有参构造器");

    }

    public Test2(String val){
        System.out.println("子类有参构造器");
    }

    public static void main(String[] args) {
        Test2 test = new Test2();

        System.out.println();

        Test2 test2 = new Test2("2");
    }

}

class Test1 {
    private String val;

    public Test1() {

        System.out.println("父类无参构造器");
    }

    public Test1(String val) {
        System.out.println("父类有参构造器");
        this.val = val;
    }
}


