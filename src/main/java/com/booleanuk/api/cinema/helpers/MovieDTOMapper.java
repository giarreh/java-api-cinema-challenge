package com.booleanuk.api.cinema.helpers;

import com.booleanuk.api.cinema.model.Movie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@AllArgsConstructor
@Service
public class MovieDTOMapper implements Function<Movie, MovieDTO> {
    @Override
    public MovieDTO apply(Movie movie) {
        return new MovieDTO(
                movie.getId(),
                movie.getTitle(),
                movie.getRating(),
                movie.getDescription(),
                movie.getRuntimeMins(),
                movie.getCreatedAt(),
                movie.getUpdatedAt()
        );
    }
}
