import java.util.SimpleTimeZone;

public class User {

    String name;
    short age;
    int height;

    public User(String name,short age,int height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public User(short age,String name,int height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public User(int height,String name, short age){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public User(short age, int height, String name){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public User(String name, int height, short age){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public User(int height, short age, String name){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public static void main(String[] args) {
    User user=new User("Nika",(short) 21,120);
        System.out.println(user.name + user.age + user.height);
        User user1=new User((short) 15,"Vika",150);
        System.out.println(user1.name + user1.age + user1.height);
        User user2=new User((short) 15,"Vika",150);
        System.out.println(user2.name + user2.age + user2.height);
        User user3=new User((short) 15,"Vika",150);
        System.out.println(user3.name + user3.age + user3.height);
        User user4=new User((short) 15,"Vika",150);
        System.out.println(user4.name + user4.age + user4.height);
        User user5=new User((short) 15,"Vika",150);
        System.out.println(user5.name + user5.age + user5.height);
    }
}