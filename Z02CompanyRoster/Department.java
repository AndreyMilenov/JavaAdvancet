package Z02CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name ;
    List<Employ> employs;

    public Department(String name, List<Employ> employs) {
        this.name = name;
        this.employs = employs;
    }
    public Department(String name){
        this.name = name;
        employs = new ArrayList<>();
    }
    public double calculateAverageSalary(){
        return  this.employs.stream().mapToDouble(Employ::getSalary).average().getAsDouble();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employ> getEmploys() {
        return employs;
    }

    public void setEmploys(List<Employ> employs) {
        this.employs = employs;
    }
}
