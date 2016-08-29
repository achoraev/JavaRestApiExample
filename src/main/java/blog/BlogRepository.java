package blog;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created on 29-Aug-16
 */
@RepositoryRestResource(collectionResourceRel = "blog", path = "blog")
public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {

    List<Blog> findByName(@Param("name") String name);

}
