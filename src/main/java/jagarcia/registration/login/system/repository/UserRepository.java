package jagarcia.registration.login.system.repository;

import jagarcia.registration.login.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
