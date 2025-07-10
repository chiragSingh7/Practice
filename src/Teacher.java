public class Teacher extends Person{
    Teacher(String name){
        super(name);
        System.out.println("Name : " + name);
    }

    @Override
    public void prof(){
        System.out.println("Prof : Teacher");
    }
}
