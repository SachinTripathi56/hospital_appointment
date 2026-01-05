package hospital_appointment.hospital_appointment.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hospital_appointment.hospital_appointment.Entities.Patient;

@Repository
public interface Patientrepo extends JpaRepository<Patient, Integer> {
   public Optional<Patient>  findById(int id); 
}
