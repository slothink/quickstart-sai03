package world.sai.misc.quickstart.sai02.core.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * Created by sai on 15. 10. 15..
 */
@NoRepositoryBean
public interface MyRepository<T, ID extends Serializable>
        extends PagingAndSortingRepository<T, ID> {
}
