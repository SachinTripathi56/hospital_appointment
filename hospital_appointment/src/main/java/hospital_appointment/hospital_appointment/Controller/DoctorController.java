package hospital_appointment.hospital_appointment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hospital_appointment.hospital_appointment.DTO.DoctorRequestDTO;
import hospital_appointment.hospital_appointment.DTO.DoctorResponseDTO;
import hospital_appointment.hospital_appointment.Service.Doctorservice;

@RestController
public class DoctorController {

    @Autowired
    private Doctorservice doctorservice;


    @PostMapping("/doctor")
    public ResponseEntity<DoctorResponseDTO> createDoc(@RequestBody DoctorRequestDTO dto ){

        try {

            return ResponseEntity.ok(this.doctorservice.createDoctor(dto));

        }
        catch(Exception e){
            e.printStackTrace();
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
    }
    
}
