public class HR extends user{
    @Override
    public void Name(String name){
        this.name = name;
    }

    public void ID(int ID){
        this.ID = ID;
    }

    public void role(String role){
        this.role = role;
    }

    public void details(){
        System.out.println(this.name + " is a " + this.role + " with his/her ID being " + this.ID);
    }
}
