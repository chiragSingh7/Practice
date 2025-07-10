public class literatureBook extends book implements write{
    literatureBook(){
        this.pages = 0;
    }

    literatureBook(int pages){
        setPages(pages);
    }

    literatureBook(int pages, String author){
        setPages(pages);
        setAuthor(author);
    }

    public void read(){
        System.out.println("You are reading a literature book with " + getPages() + " written by " + getAuthor());
    }

    public void addString(String note){
        System.out.println("Your added note is : " + note);
    }
}
