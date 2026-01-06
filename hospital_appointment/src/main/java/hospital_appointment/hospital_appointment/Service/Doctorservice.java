package hospital_appointment.hospital_appointment.Service;

import org.springframework.beans.factory.annotation.Autowired;

import hospital_appointment.hospital_appointment.DTO.DoctorRequestDTO;
import hospital_appointment.hospital_appointment.DTO.DoctorResponseDTO;
import hospital_appointment.hospital_appointment.Entities.Doctor;
import hospital_appointment.hospital_appointment.Entities.User;
import hospital_appointment.hospital_appointment.GlobalExceptions.ResourceNotFound;
import hospital_appointment.hospital_appointment.repository.DoctorRepo;
import hospital_appointment.hospital_appointment.repository.UserRepo;

public class Doctorservice {
    
@Autowired
private DoctorRepo doctorRepo;
@Autowired
private UserRepo userRepo;

public DoctorResponseDTO createDoctor(DoctorRequestDTO dto){

    User user = userRepo.findById(dto.getId()).orElseThrow(()-> new ResourceNotFound());

    if(!user.getRole().equalsIgnoreCase("doctor")){
        throw new IllegalStateException("User is not a doctor");
    }
 

    Doctor doctor = new Doctor();

    doctor.setUser(user);
    doctor.setExperience(dto.getExperience());
    doctor.setQualification(dto.getQualification());
     Doctor saved = doctorRepo.save(doctor);

     return Maptoresponse(saved);
}

private DoctorResponseDTO Maptoresponse(Doctor d){

    DoctorResponseDTO dto  = new DoctorResponseDTO();

    dto.setAvailabilityStatus("Available");
    dto.setDocId(d.getDoc_Id());
    dto.setExperience(d.getExperience());
    dto.setName("Dr. "+d.getUser().getName());
    dto.setQualification(d.getQualification());

    return dto;
}

}
