package hospital_appointment.hospital_appointment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hospital_appointment.hospital_appointment.Entities.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    public Optional<User> findById(int id);
    
}
