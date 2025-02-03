package edu.eci.cvds.tdd.library;

import edu.eci.cvds.tdd.library.user.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    /**
     * Default constructor for test class PuzzleTest
     */
    public LibraryTest() {}

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {}

    // Create library
    @Test
    public void mustCreateLibrary() {
        Library library = new Library();
        assertNotNull(library);
    }

    // Create user //TODO
    @Test
    public void shouldCreateUser(){
        User user = new User();
        Library library = new Library();
        library.addUser(user);
        assertNotNull(user);
    }

    // Add book
    @Test
    public void shouldAddBook() {

    }


    // Loan book
    @Test
    public void shouldLoanBook() {

    }

    // Return book
    @Test
    public void shouldReturnBook() {

    }

    @AfterEach
    public void tearDown() {}
}