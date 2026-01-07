package hospital_appointment.hospital_appointment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hospital_appointment.hospital_appointment.DTO.PatientRequestDTO;
import hospital_appointment.hospital_appointment.DTO.PatientResponseDTO;
import hospital_appointment.hospital_appointment.Service.PatientService;

@RestController
public class PatientController {
    
    @Autowired
    private PatientService patientService;


    @PostMapping("/patient")
    public ResponseEntity<PatientResponseDTO> createDoc(@RequestBody PatientRequestDTO dto ){

        try {

            return ResponseEntity.ok(this.patientService.createPatient(dto));

        }
        catch(Exception e){
            e.printStackTrace();
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
    }
}
