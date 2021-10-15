

public class Ebooks extends DigitalItems implements Read {
    //Attributes
    private String title;
    private String author;


    //Constructors
    public Ebooks(String title, String author, String libraryItemName){
        super(libraryItemName);
        this.title = title;
        this.author = author;
    }

    public Ebooks(String title, String author){
        super("EBook");
        this.title = title;
        this.author = author;
    }

    public Ebooks(String title){
        super("EBook");
        this.title = title;
        this.author = "unknown";
    }

    //Methods


    @Override
    public String toString() {
        return "Ebooks{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String use(){
        return "override this with read for ebook";
    }

    public String reserve(){
        return "this ebook has been reserved";
    }

    //this is bad coding. make it an interface.
//    @Override
//    public void play(){
//        read();
//    }

    public String read(){
        return "preparing book for reading...";
    }

    public String borrow(){
        return "ebook sent to email";
    }



    public String getLibraryItemName() {
        return title;
    }
}
