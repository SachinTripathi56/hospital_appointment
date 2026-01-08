package hospital_appointment.hospital_appointment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hospital_appointment.hospital_appointment.Entities.Doctor;


@Repository
public interface  DoctorRepo extends JpaRepository<Doctor, Integer> {
    public Optional<Doctor> findById(int id);
}
