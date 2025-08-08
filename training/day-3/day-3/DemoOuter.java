// Outer class
class Book {
    // Corrected spelling of 'title'
    private String title = "Lazy Man";

    // Inner class - renamed to follow Java naming conventions (PascalCase)
    class Author {
        // Corrected spelling of 'authorName'
        private String authorName = "Ram Prasad";

        // Corrected spelling of method name to 'display'
        public void display() {
            // Fixed typo in printed text
            System.out.println("The author name is: " + authorName);
            System.out.println("The title name is: " + title);
        }
    }
}

// Main class - renamed to follow PascalCase convention
public class DemoOuter {
    public static void main(String[] args) {
        // Proper instantiation of inner class from outer class
        Book.Author a1 = new Book().new Author();
        a1.display(); // Correct method name
    }
}

