public class Main {
    public static void main(String[] args) {
        IEBook ebook = new ProxyEBook("DesignPatterns.pdf");

        System.out.println("Student 1 accessing eBook...");
        ebook.display(); // Should trigger loading

        System.out.println("Student 2 accessing eBook...");
        ebook.display(); // Should NOT trigger loading again

        System.out.println("Student 3 accessing eBook...");
        ebook.display(); // Should NOT trigger loading again
    }
}
