package vn.techmaster.imdb.model;

import java.util.List;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import vn.techmaster.imdb.annotation.Benchmark;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    @Autowired
    private int id;
    private String title;
    private int year;
    private String country;
    private double rating;
    private List<String> generes;
    private int cost;
    private int revenue;

}
