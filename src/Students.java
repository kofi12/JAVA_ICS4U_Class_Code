import java.util.UUID;

public class Students {
    private String name;
    private int age;
    private String id;

    public Students(){
        this.name = "Jim Bob";
        this.age = 18;
        this.id = UUID.randomUUID().toString();
    }

    public Students(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
