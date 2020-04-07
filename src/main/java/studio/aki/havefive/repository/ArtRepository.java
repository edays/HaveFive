package studio.aki.havefive.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import studio.aki.havefive.domain.Art;

import java.util.List;

public interface ArtRepository extends CrudRepository<Art, Long> {
    @Override
    boolean existsById(Long aLong);

    boolean existsByName(String name);

    boolean existsByAuthor(String author);

    Art findByName(String name);

    List<Art> findByAuthor(String author);

    List<Art> findByYearBetween(Long yearLowerLimit, Long yearUpperLimit);

    List<Art> findByGreaterThanEqual(Long yearLowerLimit);

    Page<Art> findAll(Pageable pageble);
}
