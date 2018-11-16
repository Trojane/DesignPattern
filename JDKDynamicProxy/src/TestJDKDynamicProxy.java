public class TestJDKDynamicProxy {
    public static void main(String[] args) {

        Person person = new Man("小屁精");
        ProxyImpl proxy = new ProxyImpl();
        Object bind = proxy.bind(person);
        try {
            proxy.invoke(proxy,person.getClass().getMethod("SayHello"),null);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
