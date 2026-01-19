package hospital_appointment.hospital_appointment.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import hospital_appointment.hospital_appointment.DTO.UserResponseDTO;
import hospital_appointment.hospital_appointment.Service.UserService;



@RestController
public class UserController {

     @Autowired
   private UserService userService;


   

    @GetMapping("/getUser")
     public ResponseEntity<List<UserResponseDTO>> respList(){
        
            try {

                return ResponseEntity.ok(this.userService.getAllUsers());
                
            } catch (Exception e) {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
     }

     @GetMapping("/user/{id}")
     public ResponseEntity<UserResponseDTO> getUSerById(@PathVariable("id") int id) {
         try{
            return ResponseEntity.ok(this.userService.getById(id));
         }

         catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
         }
     }
    

}
