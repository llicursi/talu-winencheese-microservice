package com.br.talu.microservices.dbrest;

import com.br.talu.microservices.models.wine.Wine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WineRepository extends CrudRepository<Wine, Long> {

    public List<Wine> findByNameContaining(@Param("name") String name);


}
