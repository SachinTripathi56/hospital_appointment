package hospital_appointment.hospital_appointment.Controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import hospital_appointment.hospital_appointment.DTO.UserRequestDTO;
import hospital_appointment.hospital_appointment.DTO.UserResponseDTO;
import hospital_appointment.hospital_appointment.GlobalExceptions.ResourceNotFound;
import hospital_appointment.hospital_appointment.Service.UserService;


@RestController
public class UserController {
   
     @Autowired
   private UserService userService;


    @PostMapping("/CreateUser")
    public ResponseEntity<UserResponseDTO>  createuuser(@RequestBody UserRequestDTO dto) {
                
        try {
           
             if(dto.getName().isEmpty()){
                throw new ResourceNotFound("Name should not be empty");
             }
            

            return ResponseEntity.of(Optional.of(this.userService.createUser(dto)));
        }

        catch(Exception e){

            e.printStackTrace();
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        
    }
    

}
