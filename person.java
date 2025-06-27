public class person {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name != ""){
            this.name = name;
        }
    }
}
