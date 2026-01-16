package hospital_appointment.hospital_appointment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import hospital_appointment.hospital_appointment.Entities.User;
import hospital_appointment.hospital_appointment.GlobalExceptions.ResourceNotFound;
import hospital_appointment.hospital_appointment.repository.UserRepo;


@Component
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                       
          User user = userRepo.findByName(username).orElseThrow(()-> new ResourceNotFound());

          if(user!= null){
              UserDetails userDetails= org.springframework.security.core.userdetails.User.builder()
              .username(user.getName())
              .password(user.getPassword())
              .roles(user.getRole())
              .build();
                   return userDetails;                                          
          }

        throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
    }
   

    
    
}
