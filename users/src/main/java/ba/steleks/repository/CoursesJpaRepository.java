package ba.steleks.repository;

/**
 * Created by ensar on 22/03/17.
 */

import ba.steleks.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CoursesJpaRepository extends PagingAndSortingRepository<Course, Long> {
}
