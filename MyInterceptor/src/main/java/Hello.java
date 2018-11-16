import java.lang.reflect.*;

public class Hello {

    private String name;

    public Hello(String name) {
        this.name = name;
    }

    public Hello() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Class userClass=Hello.class;//将此处换成你的class 就成了
//---- 获取所有构造方法
        Constructor[] cons=userClass.getDeclaredConstructors();
        Method[] methods = userClass.getDeclaredMethods();
        System.out.println("类User的构造方法包括: ");
//---- 打印出构造方法的前缀
        for (int i=0;i<cons.length;i++)
        {
            Constructor con=cons[i]; //取出第i个构造方法。
            System.out.print(Modifier.toString(con.getModifiers()));
//---- 打印该构造方法的前缀修饰符
            System.out.print(" "+con.getName()+"("); //打印该构造方法的名字
//---- 打印该构造方法的参数。
            Class[] parameterTypes=con.getParameterTypes(); //构造方法参数集但是 数组类型显示特殊
            for(int j=0;j<parameterTypes.length;j++)
            {
                System.out.print(parameterTypes[j].getName());
            }
            System.out.println(")");
        }


        System.out.println("所有方法如下");

        for(int i=0; i<methods.length; i++){
            Method con=methods[i]; //取出第i个构造方法。
            System.out.print(Modifier.toString(con.getModifiers()));
//---- 打印该构造方法的前缀修饰符
            System.out.print(" "+con.getName()+"("); //打印该构造方法的名字
//---- 打印该构造方法的参数。
            Class[] parameterTypes=con.getParameterTypes(); //构造方法参数集但是 数组类型显示特殊
            for(int j=0;j<parameterTypes.length;j++)
            {
                System.out.print(parameterTypes[j].getName());
            }
            System.out.println(")");
        }

        System.out.println("获取所有变量");
        Field[] fields = userClass.getDeclaredFields();
        for(int i=0; i<fields.length; i++){
            Field f = fields[i];
            System.out.println(f);
        }

    }
}
