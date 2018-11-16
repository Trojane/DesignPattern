package TestOne;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIBProxy implements MethodInterceptor {

    /**
     * 获得代理类对象
     * @param clazz Class对象
     * @return 代理类CGLIBProxy对象
     */
    public Object getProxy(Class clazz){

        //创建 Enhancer 对象
        Enhancer enhancer = new Enhancer();

        //设置增强类型
        enhancer.setSuperclass(clazz);

        //设置 被代理对象为 当前对象
        enhancer.setCallback(this);

        //返回 代理对象
        return enhancer.create();


    }


    /**
     *
     * @param proxy
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {


        System.out.println("代理前");

        Object result = methodProxy.invokeSuper(proxy,objects);

        System.out.println("代理后");

        return result;
    }
}
