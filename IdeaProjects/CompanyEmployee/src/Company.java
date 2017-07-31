/**
 * Created by jhanward on 7/20/2017.
 */
public class Company {

    String name;
    int strength;
    City city;

    public Company(String name, int strength, City city) {
        this.name = name;
        this.strength = strength;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", city=" + city +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
