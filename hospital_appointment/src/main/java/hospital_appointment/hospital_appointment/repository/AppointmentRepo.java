package hospital_appointment.hospital_appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hospital_appointment.hospital_appointment.Entities.Appointment;
@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer>{
    
}
