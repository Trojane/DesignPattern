import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {

    // 被代理对象
    private Object target;
    // 拦截器全类名
    private String interceptorClass;

    /**
     * 创建MyProxy对象
     */
    public MyProxy(){

    }

    /**
     * 创建MyProxy对象
     * @param target
     * @param interceptorClass
     */
    public MyProxy(Object target, String interceptorClass){

        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    /**
     * 获取代理对象
     * @return
     */
    public Object getTarget() {

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /**
     * 执行代理对象的方法
     * @param proxy 代理类的对象
     * @param method 执行的方法
     * @param args 方法的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;

        if(interceptorClass == null){


            result = method.invoke(target,args);
            return  result;

        }

        Interceptor interceptor = (Interceptor)Class.forName(interceptorClass).newInstance();

        if(!interceptor.before(proxy,target,method,args)){
            interceptor.around(proxy,target,method,args);
        }

        result = method.invoke(target,args);
        interceptor.after(proxy,target,method,args);

        return result;

    }
}
