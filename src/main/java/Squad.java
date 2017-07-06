import java.util.List;
import java.util.ArrayList;

public class Squad {
  private String mSquadName;
  private int mSquadSize;
  private String mCause;
  private static List<Squad> instances = new ArrayList<Squad>();
  private int msquadId;
  private List<Hero> mHeroes;

  public Squad(String squadName, int squadSize, String cause) {
      mSquadName = squadName;
      mSquadSize = squadSize;
      mCause = cause;
      instances.add(this);
      msquadId = instances.size();
      mHeroes = new ArrayList<Hero>();
  }

  public String getsquadName() {
    return mSquadName;
  }

  public int getSquadSize() {
    return mSquadSize;
  }

  public String getCause() {
    return mCause;
  }

  public static List<Squad> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getsquadId() {
    return msquadId;
  }

  public static Squad find(int squadid) {
    try {
      return instances.get(squadid - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

  public List<Hero> getHeroes() {
    return mHeroes;
  }

  public void addHero(Hero hero) {
    mHeroes.add(hero);
  }
}
