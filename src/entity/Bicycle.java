package entity;

public class Bicycle {

  private String id;
  private String name;
  private String team;
  private String time;
  private int position;
  private float speed;


  public Bicycle(String id, String name, String team, String time, float speed) {
  }

  public Bicycle(String id, String name, String team, String time, int position, float speed) {
    this.id = id;
    this.name = name;
    this.team = team;
    this.time = time;
    this.position = position;
    this.speed = speed;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }

  @Override
  public String toString() {
    return "Bicycle{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", team='" + team + '\'' +
        ", position=" + position +
        ", speed=" + speed +
        '}';
  }
}
