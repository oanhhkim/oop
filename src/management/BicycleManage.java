package management;

//import comparator.CompareByTime;

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

  public void add() throws ParseException {
    System.out.print("Tên: ");
    String name;
    name = ScannerUtil.SCANNER.nextLine();
    System.out.print("Đoàn đua: ");
    String team;
    team = ScannerUtil.SCANNER.nextLine();
    String id = getTeamId(team) + String.format("%03d", list.size() + 1);
    System.out.print("Giờ cán đích: ");
    String time;
    time = ScannerUtil.SCANNER.nextLine();
    float speed = calculateSpeed(time);
    list.add(new Bicycle(id, name, team, time, speed));
  }

  public void bicycleList() throws ParseException {
    System.out.print("Nhập số lượng xe đua: ");
    int quantity = Integer.parseInt(ScannerUtil.SCANNER.nextLine());
    for (int i = 0; i < quantity; i++) {
      add();
    }
    for (Bicycle b : list) {
      System.out.println(b);
    }
  }

  public float calculateSpeed(String time) throws ParseException {
    String time_start = "07:00";
    SimpleDateFormat format = new SimpleDateFormat("HH:mm");
    Date time1 = format.parse(time_start);
    Date time2 = format.parse(time);
    float speed = 100 / ((float) (time2.getTime() - time1.getTime()) / 3600);
    return speed;
  }

  public char getTeamId(String team) {
    String[] result = team.split(" ");
    char tem = 0;
    for (int i = 0; i < result.length; i++) {
      String s = result[i];
      tem = (char) (tem + s.charAt(0));
    }
    return tem;
  }


  public boolean checkingTime(String time) {
    return true;
  }
}

