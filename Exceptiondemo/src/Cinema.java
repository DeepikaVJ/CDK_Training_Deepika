/**
 * Created by jhanward on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        User user1 = new User(11,"Seema",35,3);
        User user2 = new User(12,"Reema",21,7);

        try {
            movieService.buy(user2,2000);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        } catch (lowRatingException e) {
            e.printStackTrace();
        } catch (InvalidPriceException e) {
            e.printStackTrace();
        }

        try {
            movieService.watch(user1);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        } catch (lowRatingException e) {
            e.printStackTrace();
        }
    }
}
