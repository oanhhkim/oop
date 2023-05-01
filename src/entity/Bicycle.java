package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bicycle {

  private String id;
  private String name;
  private String team;
  private String time;

  public Bicycle() {
  }

  public Bicycle(String id, String name, String team, String time) {
    this.id = id;
    this.name = name;
    this.team = team;
    this.time = time;
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

  public float calculateSpeed(String time) {
    SimpleDateFormat format = new SimpleDateFormat("HH:mm");
    Date timeStart;
    try {
      timeStart = format.parse("07:00");
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
    Date timeFinish;
    try {
      timeFinish = format.parse(time);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
    float speed;
    speed = (float) 100 / ((timeFinish.getTime() - timeStart.getTime()) / 3600000);
    return speed;
  }

  @Override
  public String toString() {
    return id + " " + name + " " + team + " " + calculateSpeed(time);
  }
}
