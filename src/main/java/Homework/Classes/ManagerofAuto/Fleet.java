package Homework.Classes.ManagerofAuto;
  /*Транспортный Парк (Fleet)
          Поля: название, адрес, список менеджеров парка (массив).
          Методы: добавить менеджера, поиск менеджера по имени.
*/
public class Fleet {
  private String name;
  private String address;
  public FleetManager[] fleetManagers;

    public Fleet(String name, String address, FleetManager[] fleetManagers) {
      this.name = name;
      this.address = address;
      this.fleetManagers = fleetManagers;
    }

    public void addmanager(FleetManager[] fleetManagers){
      System.out.println(fleetManagers);
    }
    public void searchmanagerbyname(FleetManager manager){
      System.out.println(manager);

    }
  }
