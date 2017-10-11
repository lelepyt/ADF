package model;

public class Hello {
    public Hello() {
        super();
    }
     int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    String lastName; 
    public String sayHi(String name){
        return "Hi there" + name;   
    }
}
