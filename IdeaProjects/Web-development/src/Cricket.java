public class Cricket {
    String countryOne;
    String countryTwo;
    String Location;
    int score;

    @Override
    public String toString() {
        return "Cricket{" +
                "countryOne='" + countryOne + '\'' +
                ", countryTwo='" + countryTwo + '\'' +
                ", Location='" + Location + '\'' +
                ", score=" + score +
                '}';
    }

    public String getCountryOne() {
        return countryOne;
    }

    public void setCountryOne(String countryOne) {
        this.countryOne = countryOne;
    }

    public String getCountryTwo() {
        return countryTwo;
    }

    public void setCountryTwo(String countryTwo) {
        this.countryTwo = countryTwo;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Cricket(String countryOne, String countryTwo, String location, int score) {

        this.countryOne = countryOne;
        this.countryTwo = countryTwo;
        Location = location;
        this.score = score;
    }
}
