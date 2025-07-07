public abstract class bracelet {
    protected String size;

    public bracelet(String size) {
        if(!size.isEmpty()){
            this.size = size;
        }
    }

    public String getSize() {
        return this.size;
    }

    public abstract void style();
}
