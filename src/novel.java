public class novel extends book implements write{

    novel(){
        this.pages = 0;
    }

    novel(int pages){
        setPages(pages);
    }

    novel(int pages, String author){
        setPages(pages);
        setAuthor(author);
    }

    public void read(){
        System.out.println("You are reading a novel with " + getPages() + " number of pages written by " + getAuthor());
    }

    public void addString(String note){
        System.out.println("Your added note is : " + note);
    }
}
