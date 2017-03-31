package co.com.bancodebogota.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import co.com.bancodebogota.model.impl.TlClimaImpl;

@Transactional
public interface TlClimaRepository extends CrudRepository<TlClimaImpl, Long>  {

}
