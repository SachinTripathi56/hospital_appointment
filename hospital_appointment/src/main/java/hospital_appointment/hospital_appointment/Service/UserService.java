package hospital_appointment.hospital_appointment.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hospital_appointment.hospital_appointment.DTO.PatientResponseDTO;
import hospital_appointment.hospital_appointment.DTO.UserRequestDTO;
import hospital_appointment.hospital_appointment.DTO.UserResponseDTO;
import hospital_appointment.hospital_appointment.Entities.User;
import hospital_appointment.hospital_appointment.repository.UserRepo;

@Component
public class UserService {
    
     @Autowired
    private UserRepo userRepo;

  

    public UserResponseDTO createUser(UserRequestDTO dto ){

        User user = new User();

        user.setEmail(dto.getEmail());
        user.setName(dto.getName());
        user.setPhoneno(dto.getPhone_no());
        user.setRole(dto.getRole());
        
        User saved = userRepo.save(user);
   
        return MapToResponse(saved);
        
    }

    private UserResponseDTO MapToResponse(User user){

        UserResponseDTO dto = new UserResponseDTO();

        dto.setEmail(user.getEmail());
        dto.setName(user.getName());
        dto.setPhone(user.getPhoneno());
        dto.setRole(user.getRole());
        dto.setUser_id(user.getId());
        
        return dto;
    }

    public List<UserResponseDTO> getAllUsers(){


        List<User> list = (List<User>) userRepo.findAll();
       
        return GetAllResponse(list);
    }


    public UserResponseDTO getById(int id){


        User user = userRepo.findById(id);
           
            UserResponseDTO dto =  new UserResponseDTO();             
        dto.setEmail(user.getEmail());
        dto.setName(user.getName());
        dto.setPhone(user.getPhoneno());
        dto.setRole(user.getRole());
        dto.setUser_id(user.getId());
        return dto;

    }

    private List<UserResponseDTO> GetAllResponse(List<User> users){

               List<UserResponseDTO> l2 = users.stream().map(user-> {
              
                 UserResponseDTO dto =  new UserResponseDTO();             
        dto.setEmail(user.getEmail());
        dto.setName(user.getName());
        dto.setPhone(user.getPhoneno());
        dto.setRole(user.getRole());
        dto.setUser_id(user.getId());
        return dto;
       }).toList();
       return l2;
    }

    
}
