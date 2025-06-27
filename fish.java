public class fish implements prey,predator{

    @Override
    public void flee(){
        System.out.println("The fish is swimming");
    }

    @Override
    public void hunt(){
        System.out.println("The fish is swimming");
    }
}
