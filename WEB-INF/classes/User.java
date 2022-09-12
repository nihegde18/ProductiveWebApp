public class User {
    private static int user_id; //unique to every user , int based on nth creation
    private String password;
    private String username;
    private int age;

    public User(int id, String pass,String name,int age) {
        setUser_id(id);
        setPassword(pass);
        setUsername(name);
        setAge(age);
    }

    public void setUser_id(int id) {
        this.user_id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String un) {
        this.username = un;
    }

    public String getUsername() {
        return username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    public void print_stats(){
        System.out.println(getUser_id()+getUsername()+getAge()+getPassword());
    }

    public static void main(String[] args) {
        User nikhil = new User(3532,"nihegde","NIKHIL",20);
        nikhil.print_stats();
    }

}

