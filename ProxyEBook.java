public class ProxyEBook implements IEBook {
    private String fileName;
    private RealEBook realEBook;

    public ProxyEBook(String fileName) {
        this.fileName = fileName;
        this.realEBook = null;
    }


    public String getTitle() {
        return fileName;
    }
    public void getSize() {
        System.out.println("Size of eBook '" + fileName + "' is 2MB.");
     }

    @Override
    public void display() {
        if (realEBook == null) {
            realEBook = new RealEBook(fileName);
        }
        realEBook.display();
    }
}
