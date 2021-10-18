package org.taco.webtacocloud.data;

import org.springframework.data.repository.CrudRepository;

import org.taco.webtacocloud.model.Order;

public interface OrderRepository
        extends CrudRepository<Order, Long> {
}
