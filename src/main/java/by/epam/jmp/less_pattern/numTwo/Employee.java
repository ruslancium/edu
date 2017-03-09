package by.epam.jmp.less_pattern.numTwo;

/**
 * Created by Ruslan_Arifullin on 3/9/2017.
 */
public class Employee {
    private int id;
    private String login;
    private String password;

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Employee(int id, String login, String password) {

        this.id = id;
        this.login = login;
        this.password = password;
    }

    @Override
    public int hashCode() {
        int result = id + ((login == null) ? 0 : login.hashCode());
        result = 31 * result + ((password == null) ? 0 : password.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        if ((login == null) && (other.login != null))
            return false;
        else if (!login.equals(other.login))
            return false;

        if (password == null && other.password != null)
            return false;
        else if (!password.equals(other.password))
            return false;

        return true;
    }

    @Override
     public String toString() {
        return "Employee [id=" + id + ", login=" + login + ", password=" + password + "]";
    }
}
