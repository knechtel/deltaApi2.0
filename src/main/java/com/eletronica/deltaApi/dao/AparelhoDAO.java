package com.eletronica.deltaApi.dao;

import com.eletronica.deltaApi.bean.Aparelho;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AparelhoDAO extends CrudRepository<Aparelho, Long> {
    @Query("select a.idCliente,a.nome from Aparelho a")
    public List<Aparelho>findAllB();
}