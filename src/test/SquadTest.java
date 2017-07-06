import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  @Test
  public void Squad_instantiatesCorrectly_true() {
    Squad testSquad = new Squad("Dream Team");
    assertEquals(true, testSquad instanceof Squad);
  }
  @Test
  public void getName_SquadInstantiatesWithName_Dream Team() {
    Squad testSquad = new Squad("Dream Team");
    assertEquals("Dream Team", testSquad.getName());
  }

  @Test
  public void all_returnsAllInstancesOfSquad_true() {
    Squad firstSquad = new Squad("Dream Team");
    Squad secondSquad = new Squad("Wannabe Team");
    assertEquals(true, Squad.all().contains(firstSquad));
    assertEquals(true, Squad.all().contains(secondSquad));
  }

  @Test
  public void clear_emptiesAllCategoriesFromList_0() {
    Squad testSquad = new Squad("Dream Team");
    Squad.clear();
    assertEquals(Squad.all().size(), 0);
  }

  @Test
  public void getId_categoriesInstantiateWithAnId_1() {
    Squad testSquad = new Squad("Dream Team");
    assertEquals(1, testSquad.getId());
  }
