package TestOne;

public class Man {

    private String name;

    public Man(){
        this.name = "悟空";
    }

    public Man(String name){
        this.name = name;
    }

    public void  sayHello(){
        System.out.println(this.name+"说：你好");
    }

    @Override
    public String toString() {
        return this.name+"的 toString 方法";
    }
}
