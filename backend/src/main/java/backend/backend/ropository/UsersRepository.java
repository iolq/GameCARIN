package backend.backend.ropository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.backend.entity.Users;

public interface UsersRepository extends JpaRepository<Users,Long> {
    
}
