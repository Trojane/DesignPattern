import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflectModel {

    public static void main(String[] args) {

        Role object = (Role)Role.getInstance();
        /*object.SayHello();*/
        Role object2 = (Role)Role.getInstance("张三");
        /*object2.SayHello();*/

        Method method = null;
        try {
            method = Role.class.getMethod("SayHello");
            Object invoke = method.invoke(object);
            method = Role.class.getMethod("SayHello", String.class);
            Object invoke2 = method.invoke(object2,"你好");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
