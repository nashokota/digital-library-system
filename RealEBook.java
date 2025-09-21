// ...existing code...

public class RealEBook implements IEBook {
    private String fileName;
    private String content;

    public RealEBook(String fileName) {
        this.fileName = fileName;
        loadFromFile();
    }

    private void loadFromFile() {
        // Simulate loading from file
        this.content = "[Content of " + fileName + "]";
        System.out.println("Loading eBook from file: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying eBook: " + content);
    }
}
