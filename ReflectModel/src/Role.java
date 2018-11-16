import java.lang.reflect.InvocationTargetException;

public class Role {


    private String name;

    /**
     * 构造器
     */
    private Role() {
        name = "空";
    }

    /**
     * 有参构造器
     * @param name
     */
    private Role(String name){
        this.name = name;
    }

    /**
     * 获取名字
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 无参SayHello方法
     */
    public void SayHello(){
        System.out.println(this.getName()+"说了一句话");
    }

    /**
     * 有参SayHello方法
     * @param args
     */
    public void SayHello(String args){

        System.out.println(this.getName()+"说了一句:"+args);
    }

    /**
     * 获取实例
     * @return
     */
    public static Object getInstance(){

        Object o = null;

        try {
            o = Class.forName("Role").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return o;
    }

    /**
     * 按蚕食获取实例
     * @param args
     * @return
     */
    public static Object getInstance(String args){

        Object o = null;


        try {
            o = Class.forName("Role").getDeclaredConstructor(String.class).newInstance(args);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return o;
    }


}
