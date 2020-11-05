package com.eletronica.deltaApi.dao;

import com.eletronica.deltaApi.bean.Aparelho;
import com.eletronica.deltaApi.bean.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteDAO extends CrudRepository<Cliente, Long>{

    //order by id desc
    @Query("select c from Cliente  c order by c.id desc")
    public List<Cliente> findAllCliente();
}
