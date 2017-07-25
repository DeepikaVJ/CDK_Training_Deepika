/**
 * Created by jhanward on 7/21/2017.
 */
import java.util.Objects;

public class Person {
    String name;
    String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;

//        if(this.getName().equals(p.getName()) || this.getGender().equals(p.getGender())) {
//            return true;
//        }
        if(p == null) {
            return false;
        }
        if(p == this) {
            return true;
        }
        return Objects.equals(this.getName(), p.getName()) &&
                Objects.equals(this.getGender(), p.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
