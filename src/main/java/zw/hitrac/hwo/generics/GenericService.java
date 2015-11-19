package zw.hitrac.hwo.generics;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Daniel Nkhoma
 * @param <T>
 */
public interface GenericService<T extends Serializable> extends Serializable {

    public T save(T t);

    public List<T> findAll();

    public T findOne(Long id);

    public T findByUuid(String uuid);
}
