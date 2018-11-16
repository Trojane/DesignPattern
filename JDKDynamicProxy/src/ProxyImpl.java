import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyImpl implements InvocationHandler {

    Object object = null;

    /**
     * 根据实际对象获取代理对象
     * @param object
     * @return
     */
    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }


    /**
     * 调用被代理类的方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置通知");
        Object invoke = method.invoke(this.object, args);
        System.out.println("后置通知");
        return invoke;
    }
}
