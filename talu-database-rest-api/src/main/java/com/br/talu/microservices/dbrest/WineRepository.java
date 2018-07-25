package com.br.talu.microservices.dbrest;

import com.br.talu.microservices.models.wine.Wine;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@Api("Wines")
@RepositoryRestResource(path="wines")
public interface WineRepository extends PagingAndSortingRepository<Wine, Long> {

    @ApiOperation("Find all wines containing")
    public List<Wine> findByNameContaining(@Param("name") String name);


}
