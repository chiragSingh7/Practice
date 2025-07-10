public class Employee {
    private String name;
    private String ID;
    private String mail;

    public Employee(String name, String ID, String mail){
        this.name = name;
        this.ID = ID;
        this.mail = mail;
    }

    public String getName(){
        return this.name;
    }

    public String getID(){
        return this.ID;
    }

    public String getMail(){
        return this.mail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + ID + '\'' +
                ", email='" + mail + '\'' +
                '}';
    }

}
