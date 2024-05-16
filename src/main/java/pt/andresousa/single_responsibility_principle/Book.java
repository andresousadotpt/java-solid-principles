package pt.andresousa.single_responsibility_principle;

/**
 * SingleResponsibilityPrinciple good class
 */
public class Book {

    private String name;
    private String author;
    private String text;

    /**
     * Constructor
     */
    public Book() {
    }

    /**
     * Constructor
     * @param name book name
     * @param author book author
     * @param text book text
     */
    public Book(final String name, final String author, final String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    /**
     * Copy constructor
     * @param book book to copy
     */
    public Book(final Book book) {
        name = book.name;
        author = book.author;
        text = book.text;
    }

    private Book(final Builder builder) {
        setName(builder.name);
        setAuthor(builder.author);
        setText(builder.text);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    /**
     * GOOD, goes with the Single Responsibility Principle
     * Method directly is related to the book properties
     */
    public String replaceWordInText(final String word, final String replacementWord) {
        return text.replaceAll(word, replacementWord);
    }

    /**
     * GOOD, goes with the Single Responsibility Principle
     * Method directly is related to the book properties
     */
    public boolean isWordInText(final String word) {
        return text.contains(word);
    }

    /**
     * BAD, goes against the Single Responsibility Principle
     * Method for outputting text that is not directly related to the book
     */
    void printTextToConsole(final String text) {
        //our code for formatting and printing the text
    }

    /**
     * BAD, goes against the Single Responsibility Principle
     * Method for outputting text that is not directly related to the book
     */
    void printTextToAnotherMedium(final String text) {
        // code for writing to any other location..
    }

    /**
     * {@code Book} builder static inner class.
     */
    public static final class Builder {
        private String name;
        private String author;
        private String text;

        public Builder() {
        }

        /**
         * Sets the {@code name} and returns a reference to this Builder enabling method chaining.
         *
         * @param name the {@code name} to set
         * @return a reference to this Builder
         */
        public Builder name(final String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the {@code author} and returns a reference to this Builder enabling method chaining.
         *
         * @param author the {@code author} to set
         * @return a reference to this Builder
         */
        public Builder author(final String author) {
            this.author = author;
            return this;
        }

        /**
         * Sets the {@code text} and returns a reference to this Builder enabling method chaining.
         *
         * @param text the {@code text} to set
         * @return a reference to this Builder
         */
        public Builder text(final String text) {
            this.text = text;
            return this;
        }

        /**
         * Returns a {@code Book} built from the parameters previously set.
         *
         * @return a {@code Book} built with parameters of this {@code Book.Builder}
         */
        public Book build() {
            return new Book(this);
        }
    }
}
