public class Main {
    public static void main(String[] args) {
        IEBook ebook = new ProxyEBook("DesignPatterns");

        System.out.println("Student 1 accessing eBook...");
        ebook.display();

        System.out.println("Student 2 accessing eBook...");
        ebook.display();

    }
}