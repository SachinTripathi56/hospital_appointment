package hospital_appointment.hospital_appointment.repository;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hospital_appointment.hospital_appointment.Entities.Appointment;
@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer>{

        boolean existsByDoctorIdAndAppointmentDateAndAppointmentTime(
        int Doctor_id,
        LocalDate Appnt_dat,
        LocalTime Appnt_Time
    );
    
}
