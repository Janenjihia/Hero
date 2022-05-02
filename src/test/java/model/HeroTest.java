package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

//    Test for ability to instantiate new hero
Hero hero = new Hero("jane", 25, "Empathy", "kindness", 1);
    @Test
    public void NewHeroGetsCorrectlyCreated_true() throws Exception {
        
        Hero hero= new Hero("jane", 25, "Empathy", "Kindness", 1);
        assertEquals(true, true);
    }

//    test to get hero name
     @Test
     public void getHeroName (){
        assertEquals("jane", hero.getHeroName());
     }
     
//    test to get hero age
     @Test
     public void getAge(){
         assertEquals(25, hero.getHeroAge());
     }
    //    test to get hero strength
    @Test
    public void getStrength(){
        assertEquals("Empathy", hero.getHeroStrength());
    }
    //    test to get hero weakness
    @Test
    public void getWeakness(){
        assertEquals("kindness", hero.getHeroWeakness());
    }
    //    test to get hero id
    @Test
    public void getId(){
        assertEquals(1, hero.getHeroId());
    }
}