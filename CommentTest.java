

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestGetRating()
    {
        Comment comment1 = new Comment("Mike", "very good", 3);
        assertEquals(3, comment1.getRating());
        Comment comment2 = new Comment("Jim Johnson", "I like this product", 4);
      
        comment2.upvote();
       
        assertEquals(1, comment2.getVoteCount());
        assertEquals(1, comment2.getVoteCount());
        comment2.upvote();
        
        comment2.upvote();
        
        comment2.upvote();
        assertEquals(4, comment2.getVoteCount());
        assertEquals(4, comment2.getRating());
        comment2.upvote();
        assertEquals(4, comment2.getRating());
        java.lang.String result = comment2.getFullDetails();
        
    }

    @Test
    public void TestDownVote()
    {
        Comment comment2 = new Comment("Kathy", "test vote", 3);
        comment2.upvote();
        comment2.upvote();
        comment2.downvote();
        assertEquals(1, comment2.getVoteCount());
    }
}


