package employeeApp;

import java.util.Arrays;

public class Company {

    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, int developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = new String[developerNames];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro >= 0 ) {
            this.giro = giro;
        } else {
            System.out.println("Giro can't be negative");
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }

    public void addEmployee(int index , String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Invalid index " + index);
        } else if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("Duplicate index " + index);
        }
    }

}
