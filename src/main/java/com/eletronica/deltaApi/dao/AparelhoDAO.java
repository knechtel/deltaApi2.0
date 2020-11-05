package com.eletronica.deltaApi.dao;

import com.eletronica.deltaApi.bean.Aparelho;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AparelhoDAO extends CrudRepository<Aparelho, Long> {
    @Query("select a.idCliente,a.nome from Aparelho a")
    public List<Aparelho>findAllB();
    @Query("select a from Aparelho a where a.idCliente= :idCliente")
    public List<Aparelho>findAllByIdCliente(@Param("idCliente") Integer idCliente);
    @Query("select a from Aparelho a where a.id= :id")
    public Aparelho findByIdInt(@Param("id") Integer id);
}