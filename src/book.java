public abstract class book {
    protected int pages = 0;
    protected String author = "not mentioned";

    public void setPages(int pages){
        if(pages>0){
            this.pages = pages;
        }
        else{
            System.out.println("A book cannot have negative pages.");
        }
    }

    public int getPages(){
        return this.pages;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    abstract void read();
}
