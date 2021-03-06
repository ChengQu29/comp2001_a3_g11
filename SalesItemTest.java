

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SalesItemTest
{
    private SalesItem salesIte1;
    private SalesItem salesIte2;
    private SalesItem salesIte3;
    private SalesItem salesIte4;

    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
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
        salesIte1 = new SalesItem("Mountain Bike", 400);
        salesIte2 = new SalesItem("Iphone 8", 500);
        salesIte3 = new SalesItem("Magic Wand", -66666);
        salesIte4 = new SalesItem("Lord of the Ring", 0);
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
    public void TestAddComments()
    {
        SalesItem salesIte1 = new SalesItem("Mountain Bike", 400);
        assertEquals(true, salesIte1.addComment("Mike", "good bike", 5));
        assertEquals(false, salesIte1.addComment("James", "awesome", 6));
        assertEquals(false, salesIte1.addComment("Kathy", "so bad", 0));
        assertEquals(true, salesIte1.addComment("Dana", "not impressed", 1));
    }

    @Test
    public void TestDuplicateAuthor()
    {
        SalesItem salesIte1 = new SalesItem("Mountain Bike", 400);
        assertEquals(true, salesIte1.addComment("Mike", "very good", 5));
        assertEquals(false, salesIte1.addComment("Mike", "very good", 5));
    }

   

    @Test
    public void TestPrice()
    {
        assertEquals(400, salesIte1.getPrice());
        assertEquals(66666, salesIte3.getPrice());
        assertEquals(400, salesIte2.getPrice());
        assertEquals(0, salesIte4.getPrice());
    }



    @Test
    public void TestGetNumberOfComments()
    {
        assertEquals(true, salesIte1.addComment("Mike", "very good bike", 5));
        assertEquals(1, salesIte1.getNumberOfComments());
        assertEquals(true, salesIte1.addComment("James", "bike is so so", 3));
        assertEquals(2, salesIte1.getNumberOfComments());
        assertEquals(true, salesIte4.addComment("Mike", "This is OK", 3));
        assertEquals(true, salesIte4.addComment("Kathy", "awesome", 5));
        assertEquals(2, salesIte4.getNumberOfComments());
    }

    @Test
    public void TestUpVoteComment()
    {
        assertEquals(true, salesIte1.addComment("Mike", "very good bike", 5));
        assertEquals(true, salesIte1.addComment("James", "bike is so so", 3));
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(0);
        salesIte1.showInfo();
    }

    @Test
    public void TestDownVoteComment()
    {
        assertEquals(true, salesIte1.addComment("Mike", "very good bike", 5));
        assertEquals(true, salesIte1.addComment("James", "bike is so so", 3));
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(0);
        salesIte1.downvoteComment(0);
        salesIte1.showInfo();
    }

    @Test
    public void TestRemoveComment()
    {
        assertEquals(true, salesIte3.addComment("James", "this is cool", 4));
        assertEquals(1, salesIte3.getNumberOfComments());
        salesIte3.removeComment(0);
        assertEquals(0, salesIte3.getNumberOfComments());
        salesIte3.showInfo();
        salesIte3.showInfo();
    }

    @Test
    public void TestFindMostHelpful()
    {
        SalesItem salesIte1 = new SalesItem("Mountain Bike", 400);
        salesIte1.upvoteComment(0);
        assertEquals(false, salesIte1.findMostHelpfulComment());
        assertEquals(true, salesIte2.addComment("Mike", "this is so great", 5));
        assertEquals(true, salesIte2.addComment("james", "this is so so", 1));
        assertEquals(true, salesIte2.addComment("Kathy", "ok", 3));
        salesIte2.upvoteComment(0);
        salesIte2.upvoteComment(0);
        salesIte2.upvoteComment(1);
        salesIte2.upvoteComment(1);
        salesIte2.upvoteComment(1);
        salesIte2.upvoteComment(2);
        assertEquals(1, salesIte2.findMostHelpfulComment());
    }


    @Test
    public void TestName()
    {
        assertEquals("Magic Wand", salesIte3.getName());
    }
}












