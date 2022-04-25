package Poongi.ratingsdataservice.resources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Poongi.ratingsdataservice.Rating;
import Poongi.ratingsdataservice.UserRating;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
    public  int getrandomrating(){return  (int) ((Math.random()*5)+1);}
    @RequestMapping("/{movieid}")
    public Rating getRating(@PathVariable("movieid")String movieid){return new Rating(movieid, getrandomrating());}

    @RequestMapping("/users/{userid}")
    public UserRating getuserRating(@PathVariable("userid")String userid){
        List<Rating> ratings = Arrays.asList(
                new Rating("1",getrandomrating()),
                new Rating("2",getrandomrating()),
                new Rating("3",getrandomrating())
        );
       UserRating userRating = new UserRating();
       userRating.setUserRating(ratings);
       return userRating;
    }

}
