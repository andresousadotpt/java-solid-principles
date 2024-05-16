# [Single Responsibility Principle](https://www.baeldung.com/solid-principles#s:~:text=3.%20Single%20Responsibility)

This principle states that a class should only have one responsibility.<br> 
Furthermore, it should only have one reason to change.

Like the example we have at Book.java, we have methods that are responsible for the book. Like:
```java
    /**
     * GOOD, goes with the Single Responsibility Principle
     * Method directly is related to the book properties
     */
    public String replaceWordInText(final String word, final String replacementWord){
        return text.replaceAll(word, replacementWord);
    }

    /**
     * GOOD, goes with the Single Responsibility Principle
     * Method directly is related to the book properties
     */
    public boolean isWordInText(final String word){
        return text.contains(word);
    }
```
The methods are directly related to the book properties, so they are following the Single Responsibility Principle.

If we add a functionality to print the text to the console on our Book.java, we would be going against the Single Responsibility Principle.

```java
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
```

But to avoid that, we will create a new class called BookPrinter.java, and we will move the printTextToConsole and printTextToAnotherMedium methods to it.

```java
/**
 * SingleResponsibilityPrinciple bad class
 */
public class BookPrinter {
    private final Book book;

    public BookPrinter(final Book book) {
        this.book = book;
    }

    /**
     * BAD, goes against the Single Responsibility Principle
     * Method for outputting text that is not directly related to the book
     */
    void printTextToConsole(){
        //our code for formatting and printing the text
    }

    /**
     * BAD, goes against the Single Responsibility Principle
     * Method for outputting text that is not directly related to the book
     */
    void printTextToAnotherMedium(){
        // code for writing to any other location..
    }
}
```
