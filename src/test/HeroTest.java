import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Before
  public void tearDown() {
    Hero.clear();
  }

  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero newHero = new Hero("Super Yokke", 25, "Tsunami Attack", "Lightning");
    assertEquals(true, newHero instanceof Hero);
  }

  @Test
  public void Hero_instantiateswithDescription_String() {
  Hero myHero = new Hero("Super Yokke", 25, "Tsunami Attack", "Lightning");
    assertEquals("Super Yokke", myHero.getName(), 25 ,myHero.getAge());
  }
  @Test
  public void all_returnsAllInstancesOfHero_true() {
    Hero firstHero = new Hero("Super Yokke", 25, "Tsunami Attack", "Lightning");
    Hero secondHero = new Hero("Wonder Witty", 33, "Mind Reader", "Headache");
    assertEquals(true, Hero.all().contains(firstHero));
    assertEquals(true, Hero.all().contains(secondHero));
  }

    @Test
    public void clear_emptiesAllHerosFromArrayList_0() {
      Hero myHero = new Hero("Super Yokke", 25, "Tsunami Attack", "Lightning");
      Hero.clear();
      assertEquals(0, Hero.all().size());
    }

    @Test
    public void getId_HerosInstantiateWithAnID_1() {
      Hero.clear();  // Remember, the test will fail without this line! We need to empty leftover Heros from previous tests!
      Hero myHero = new Hero("Super Yokke", 25, "Tsunami Attack", "Lightning");
      assertEquals(1, myHero.getId());
    }

    @Test
    public void find_returnsHeroWithSameId_secondHero() {
      Hero firstHero = new Hero("Super Yokke", 25, "Tsunami Attack", "Lightning");
      Hero secondHero = new Hero("Wonder Witty", 33, "Mind Reader", "Headache");
      assertEquals(Hero.find(secondHero.getId()), secondHero);
    }

}
