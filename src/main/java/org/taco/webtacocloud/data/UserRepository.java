package org.taco.webtacocloud.data;

import org.springframework.data.repository.CrudRepository;
import org.taco.webtacocloud.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
