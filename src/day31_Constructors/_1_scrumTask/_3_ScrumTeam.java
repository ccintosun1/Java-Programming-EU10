package day31_Constructors._1_scrumTask;import java.util.ArrayList;import java.util.Arrays;public class _3_ScrumTeam {    // Attributes ------    public String PO, BA, SM;    public ArrayList<_1_Tester> testersList = new ArrayList<>();    public ArrayList<_2_Developer> devopsList = new ArrayList<>();    public int daysOfSprint;    // constructor  -------    public _3_ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {        this.PO = PO;        this.BA = BA;        this.SM = SM;        this.daysOfSprint = daysOfSprint;    }    // instance methods    public void addTester(_1_Tester tester){        testersList.add(tester);  // testerList Array listine tester lari tek tek ekle    }    public void addTesters(_1_Tester[] testers){        testersList.addAll(Arrays.asList(testers));  // testerList Array listine testers arraylerini ekle    }    public void addDeveloper(_2_Developer developer){        devopsList.add(developer);  // developer lari devops ArrayListine ekle    }    public void addDevelopers(_2_Developer[] developers){        devopsList.addAll(Arrays.asList(developers));  // // developers arraylarini devops ArrayListine ekle    }    public void removeTester(int employeeID){        testersList.removeIf( p -> p.employeeID == employeeID);    }    public void removeDeveloper(int employeeID){        testersList.removeIf( p -> p.employeeID == employeeID);    }    public String toString() {        return "_3_ScrumTeam{" +                "PO='" + PO + '\'' +                ", BA='" + BA + '\'' +                ", SM='" + SM + '\'' +                ", total number of testers= " + testersList.size() +                ", total number of testers devolopers= " + devopsList.size() +                ", daysOfSprint=" + daysOfSprint +                '}';    }}/*	create a class called ScrumTeam	           Attributes:	                String PO, BA, SM;	                ArrayList<Tester> testersList = new ArrayList<>();	                ArrayList<Developer> devopsList = new ArrayList<>();	                int daysOfSprint;	               Add A constructor that can set the fields PO, BA, and SM	             Actions:	                  addTester(Tester tester): adds the given tester to the testers ArrayList	                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList	                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList	                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList	                  removeTester(long employeeID): removes the given tester from the testers ArrayList	                  removeDeveloper(long employeeID): removes the developer from the developers ArrayList	                  toString(): prints number of tester,& developers,  PO name, SM name, BA name */