package pt.andresousa.single_responsibility_principle;

/**
 * SingleResponsibilityPrinciple bad class
 */
public class BookPrinter {
    private final Book book;

    public BookPrinter(final Book book) {
        this.book = book;
    }



    public static Book getBook(){
        return null;
    }

    /**
     * BAD, goes against the Single Responsibility Principle
     * Method for outputting text that is not directly related to the book
     */
    void printTextToConsole() {
        //our code for formatting and printing the text
    }

    /**
     * BAD, goes against the Single Responsibility Principle
     * Method for outputting text that is not directly related to the book
     */
    void printTextToAnotherMedium() {
        // code for writing to any other location..
    }
}
