package hospital_appointment.hospital_appointment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hospital_appointment.hospital_appointment.DTO.AppointmentRequestDTO;
import hospital_appointment.hospital_appointment.DTO.AppointmentResponseDTO;
import hospital_appointment.hospital_appointment.Entities.Appointment;
import hospital_appointment.hospital_appointment.Entities.Doctor;
import hospital_appointment.hospital_appointment.Entities.Patient;
import hospital_appointment.hospital_appointment.GlobalExceptions.ResourceNotFound;
import hospital_appointment.hospital_appointment.repository.AppointmentRepo;
import hospital_appointment.hospital_appointment.repository.DoctorRepo;
import hospital_appointment.hospital_appointment.repository.Patientrepo;

@Component
public class AppointmentService {
  
    @Autowired
    private DoctorRepo doctorRepo;
   
    @Autowired
    private Patientrepo patientrepo;
    @Autowired
    private AppointmentRepo appointmentrepo;

    public AppointmentResponseDTO createAppnt (AppointmentRequestDTO dto){

       
           Patient patient = patientrepo.findById(dto.getPatient_id()).orElseThrow(()-> new ResourceNotFound("Patient id is not correct"));
          Doctor  doctor = doctorRepo.findById(dto.getDoctor_id()).orElseThrow(()-> new ResourceNotFound("doctor id is not correct"));
     
       

        Appointment appointment = new Appointment();

        appointment.setTitle(dto.getTitle());
        appointment.setAppnt_dat(dto.getAppnt_Date());
        appointment.setAppnt_Time(dto.getAppnt_time());
        appointment.setBooking_status("booked");
        appointment.setDoctor(doctor);
        appointment.setPatient(patient);

        Appointment saved = this.appointmentrepo.save(appointment);

        return mapToResponse(saved);
    }

    private AppointmentResponseDTO mapToResponse(Appointment a){

             AppointmentResponseDTO dto = new AppointmentResponseDTO();

             dto.setAppnt_id(a.getId());
             dto.setDoctor_name(a.getDoctor().getUser().getName());
             dto.setPatient_name(a.getDoctor().getUser().getName());
             dto.setStatus(a.getBooking_status());
             dto.setDoctor_Id(a.getDoctor().getDoc_Id());
             dto.setPatient_Id(a.getPatient().getId());

       

        return dto;
    }



}
