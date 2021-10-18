package org.taco.webtacocloud.data;

import org.springframework.data.repository.CrudRepository;

import org.taco.webtacocloud.model.Taco;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {
}
