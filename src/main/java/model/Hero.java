package model;

public class Hero {
    private String heroName;
    private int Age;
    private String strength;
    private String Weakness;
    private int Id;



    public Hero(String heroName, int Age, String strength, String Weakness, int Id) {
        this.heroName=heroName;
        this.Age=Age;
        this.Weakness=Weakness;
        this.Id=Id;
        this.strength=strength;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }




    public String getHeroName() {
        return heroName;
    }

    public int getHeroAge() {
        return Age;
    }

    public String getHeroStrength() {
        return strength;
    }

    public String getHeroWeakness() {
        return Weakness;
    }
}
