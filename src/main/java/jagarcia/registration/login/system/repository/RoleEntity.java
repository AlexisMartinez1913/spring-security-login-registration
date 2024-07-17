package jagarcia.registration.login.system.repository;

import jagarcia.registration.login.system.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleEntity extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
