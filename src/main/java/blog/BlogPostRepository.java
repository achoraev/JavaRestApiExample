package blog;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created on 29-Aug-16
 */
@RepositoryRestResource(collectionResourceRel = "blogpost", path = "blogpost")
public interface BlogPostRepository extends PagingAndSortingRepository<BlogPost, Long> {

}
