package Poongi.movieinfoservice.Resources;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Poongi.movieinfoservice.Movie;

@RestController
@RequestMapping("/movie")
public class MovieResource {

    @RequestMapping("/{movieid}")
    public Movie getMovieInfo(@PathVariable("movieid") String movieid){
        return new Movie(movieid,movieid);
    }
}
