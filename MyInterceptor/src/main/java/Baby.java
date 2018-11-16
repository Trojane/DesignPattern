public class Baby implements Person {

    private String name;

    public Baby() {
    }

    public Baby(String name) {
        this.name = name;
    }


    public void sayHello() {
        System.out.println(this.name+"说：你好");
    }

    public static void main(String[] args) {

        MyInterceptor myInterceptor = new MyInterceptor();
        Baby baby = new Baby("狗狗");
        MyProxy myProxy = new MyProxy(baby,"MyInterceptor");

        Person person = (Person)myProxy.getTarget();
        person.sayHello();


    }
}
