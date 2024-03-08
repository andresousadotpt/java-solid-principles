package pt.andresousa.SingleResponsibilityPrinciple;

/**
 * SingleResponsibilityPrinciple bad class
 */
public class BookPrinter {
    /**
     * BAD, goes against the Single Responsibility Principle
     * Method for outputting text that is not directly related to the book
     */
    void printTextToConsole(final String text){
        //our code for formatting and printing the text
    }

    /**
     * BAD, goes against the Single Responsibility Principle
     * Method for outputting text that is not directly related to the book
     */
    void printTextToAnotherMedium(final String text){
        // code for writing to any other location..
    }
}
