package TestTwo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Woman {

    private String name;

    public Woman() {
        this.name = "八戒";
    }

    public Woman(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println(this.name + ":你好");
    }

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(Woman.class);

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("测试方法前");
                Object o = methodProxy.invokeSuper(proxy, args);
                System.out.println("测试方法后");
                return o;
            }
        }
               );


        Woman o = (Woman)enhancer.create();
        o.sayHello();

    }

}

