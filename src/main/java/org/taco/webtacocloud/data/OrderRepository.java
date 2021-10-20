package org.taco.webtacocloud.data;

import org.springframework.data.repository.CrudRepository;

import org.taco.webtacocloud.model.Order;
import org.taco.webtacocloud.model.User;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface OrderRepository
        extends CrudRepository<Order, Long> {
    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
