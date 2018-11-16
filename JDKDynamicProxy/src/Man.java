public class Man implements Person{

    private String name;

    public Man(){
        name = "空";
    }

    public Man(String name){
        this.name = name;
    }

    public void SayHello(){
        System.out.println(this.name+"说：你好啊");
    }


}
