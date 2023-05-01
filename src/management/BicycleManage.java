package management;

import comparator.CompareByTime;
import entity.Bicycle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import util.ScannerUtil;

public class BicycleManage {

  private List<Bicycle> list;

  public BicycleManage() {
    list = new ArrayList<>();
  }

  public void add() {
    System.out.print("Tên: ");
    String name;
    name = ScannerUtil.SCANNER.nextLine();
    System.out.print("Đoàn đua: ");
    String team;
    team = ScannerUtil.SCANNER.nextLine();
    String id = getTeamId(team) + String.format("%03d", list.size() + 1);
    String time;
    do {
      System.out.print("Giờ cán đích: ");
      time = ScannerUtil.SCANNER.nextLine();
    } while (!checkTime(time));
    list.add(new Bicycle(id, name, team, time));
  }

  public void bicycleList() {
    System.out.print("Nhập số lượng xe đua: ");
    int quantity = Integer.parseInt(ScannerUtil.SCANNER.nextLine());
    for (int i = 0; i < quantity; i++) {
      add();
    }
    List<Bicycle> position = list;
    position.sort(new CompareByTime());
    for (int i = 0; i < position.size(); i++) {
      System.out.println(position.get(i) + " " + Integer.toString(i + 1));
    }
  }

  public String getTeamId(String team) {
    String[] result = team.split(" ");
    String tem = "";
    for (int i = 0; i < result.length; i++) {
      String s = result[i];
      tem = tem + s.charAt(0);
    }
    return tem;
  }

  public boolean checkTime(String time) {
    SimpleDateFormat format = new SimpleDateFormat("HH:mm");
    Date timeInput;
    Date timeStart;
    try {
      timeStart = format.parse("07:00");
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
    try {
      timeInput = format.parse(time);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
    if (timeInput.before(timeStart)) {
      return false;
    }
    return true;
  }
}

