package hospital_appointment.hospital_appointment.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hospital_appointment.hospital_appointment.DTO.AppointmentRequestDTO;
import hospital_appointment.hospital_appointment.DTO.AppointmentResponseDTO;
import hospital_appointment.hospital_appointment.Service.AppointmentService;
import hospital_appointment.hospital_appointment.Service.UserService;
import jakarta.validation.Valid;


@RestController
public class bookingController {
    @Autowired
   private AppointmentService app_Service;
     @Autowired
   private UserService userService;


    @PostMapping("/appointment")
    public ResponseEntity<AppointmentResponseDTO> getAppointment(@Valid @RequestBody AppointmentRequestDTO appointment ){
      
        try {
            
            return ResponseEntity.ok(this.app_Service.createAppnt(appointment));
        } catch (Exception e) {
            System.out.println("No noooooooooooooooo");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    

}
