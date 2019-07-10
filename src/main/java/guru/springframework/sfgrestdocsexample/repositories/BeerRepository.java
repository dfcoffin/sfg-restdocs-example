package guru.springframework.sfgrestdocsexample.repositories;

import guru.springframework.sfgrestdocsexample.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by Donald F. Coffin on 07/10/2019 at 17:02
 */

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
