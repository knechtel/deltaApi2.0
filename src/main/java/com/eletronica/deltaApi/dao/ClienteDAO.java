package com.eletronica.deltaApi.dao;

import com.eletronica.deltaApi.bean.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDAO extends CrudRepository<Cliente, Long>{


}
