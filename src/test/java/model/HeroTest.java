package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void NewHeroGetsCorrectlyCreated_true() throws Exception {
      Hero hero = new Hero();
        assertEquals(true, hero instanceof Hero);
    }



}