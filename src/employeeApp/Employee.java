package employeeApp;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, int healthplansSize) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = new String[healthplansSize];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }

    public void addHealthplan(int index , String name) {
        if(index < 0 || index >= healthplans.length) {
            System.out.println("Invalid index" + index);
        } else if (healthplans[index] == null) {
            healthplans[index] = name;
        } else {
            System.out.println("Index " + index + " already exists");
        }
    }

}
