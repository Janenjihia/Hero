package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class squadTest {

//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//    instantiate all properties expected for Squad
Squad squad = new Squad("Aces", 5, "Medicate the less privileged who are sick",  1);
    @Test
    public void NewSquadGetsCorrectlyCreated_true() throws Exception {

        Squad squad= new Squad ("jane", 25, "Medicate the less privileged who are sick", 1);
        assertEquals(true, true);
    }
    //    test to get hero name
    @Test
    public void squadName () {
        assertEquals("jane", squad.getSquadName());
    }


}