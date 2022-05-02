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
Squad squad = new Squad("Aces", 5, "Medicate the less privileged who are sick",  001);
    @Test
    public void NewSquadGetsCorrectlyCreated_true() throws Exception {

        Squad squad= new Squad ("Aces", 5, "Medicate the less privileged who are sick", 001);
        assertEquals(true, true);
    }
    //    test to get squad name
    @Test
    public void squadName () {
        assertEquals("Aces", squad.getSquadName());
    }
    //    test to get squad maxSize
    @Test
    public void squadMaxSize () {
        assertEquals(5, squad.getMaxSize());
    }

    //    test to get squad cause
    @Test
    public void squadCause() {
        assertEquals("Medicate the less privileged who are sick", squad.getCause());
    }

    //    test to get squad  code
    @Test
    public void squadCode() {
        assertEquals(001, squad.getCode());
    }


}