/**
 * Created by jhanward on 7/26/2017.
 */
public class MovieService {
    public void watch(User user) throws InvalidAgeException, lowRatingException {
        if(! (((Integer)(user.getAge())) instanceof Integer )) {
            throw new InvalidAgeException("Age is inavlid, can't be below zero or negative");
        } else if ((user.getAge()) < 10 ) {
            throw new InvalidAgeException("Age below 10");
        } else if ((user.getAge()) < 20 ) {
            throw new InvalidAgeException("Age below 20");
        }
        if (user.getRating() < 3) {
            throw new lowRatingException("Rating for the movie is low");
        } else {
            System.out.println("User can enjoy movie");
        }
    }

    public void buy(User user, double price) throws InvalidAgeException, lowRatingException, InvalidPriceException {
        if(!((Double)price instanceof Double )) {
            throw new InvalidPriceException("Ratings for this movie are invalid");
        }
        if(price < 2000) {
            throw new InvalidPriceException("Price less than 2000");
        }

        if(! (((Integer)(user.getAge())) instanceof Integer )) {
            throw new InvalidAgeException("Age is inavlid, can't be below zero or negative");
        } else if(user.getAge() <= 0) {
            throw new InvalidAgeException("Age is inavlid, can't be below zero or negative");
        }
        else if ((user.getAge()) < 10 ) {
            throw new InvalidAgeException("Age below 10");
        } else if ((user.getAge()) < 20 ) {
            throw new InvalidAgeException("Age below 20");
        }
        if (user.getRating() < 3) {
            throw new lowRatingException("Rating for the movie is low");
        } else {
            System.out.println("User can enjoy movie");
        }
    }
}