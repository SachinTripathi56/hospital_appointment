package hospital_appointment.hospital_appointment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hospital_appointment.hospital_appointment.DTO.PatientRequestDTO;
import hospital_appointment.hospital_appointment.DTO.PatientResponseDTO;
import hospital_appointment.hospital_appointment.Entities.Patient;
import hospital_appointment.hospital_appointment.Entities.User;
import hospital_appointment.hospital_appointment.GlobalExceptions.ResourceNotFound;
import hospital_appointment.hospital_appointment.repository.Patientrepo;
import hospital_appointment.hospital_appointment.repository.UserRepo;

@Service
public class PatientService {
    

@Autowired
private Patientrepo patientrepo;

@Autowired
private UserRepo userRepo;

public PatientResponseDTO createPatient(PatientRequestDTO dto ){

    User user = userRepo.findById(dto.getId()).orElseThrow(()-> new ResourceNotFound());

    if(!user.getRole().equalsIgnoreCase("patient")){
        throw new IllegalStateException("User is not a PATIENT");
    }

    Patient patient = new Patient();

    patient.setUser(user);
    patient.setAge(dto.getAge());
    patient.setBllodGoup(dto.getBllodGoup());
    patient.setGender(dto.getGender());

    Patient saved = patientrepo.save(patient);

    return MapToResponse1(saved);
}

private PatientResponseDTO MapToResponse1(Patient pa){

     PatientResponseDTO dto = new PatientResponseDTO();

    dto.setId(pa.getId());
    dto.setName(pa.getUser().getName());
    dto.setAge(pa.getAge());
    dto.setBllodGoup(pa.getBllodGoup());
    dto.setGender(pa.getGender());

    return dto;



}


}
