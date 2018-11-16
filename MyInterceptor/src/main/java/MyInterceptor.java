import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("before");
        return false;
    }

    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("around");

    }

    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("after");

    }
}
