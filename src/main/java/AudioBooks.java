

public class AudioBooks extends DigitalItems{
    //Attributes
    private String title;
    private String author;


    //Constructors
    public AudioBooks(String title, String author, String libraryItemName){
        super(libraryItemName);
        this.title = title;
        this.author = author;
    }

    public AudioBooks(String title, String author){
        super("AudioBook");
        this.title = title;
        this.author = author;
    }

    public AudioBooks(String title){
        super("AudioBook");
        this.title = title;
        this.author = "Unknown";
    }


    //Methods


    @Override
    public String toString() {
        return "AudioBooks{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String use(){
        return "override with play for audiobook";
    }

    public String reserve(){
        return "this audiobook has been reserved";
    }

//    public String play(){
//        return "Playing audiobook";
//    }

    public String borrow(){
        return "audiobook sent to email.";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLibraryItemName() {
        return title;
    }


}
