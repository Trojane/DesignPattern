package TestOne;

public class TestCGLIBProxyOne {

    public static void main(String[] args) {

        CGLIBProxy cglibProxy = new CGLIBProxy();

        Man proxy = (Man)cglibProxy.getProxy(Man.class);

        proxy.sayHello();

        System.out.println(proxy.toString());

    }


}
