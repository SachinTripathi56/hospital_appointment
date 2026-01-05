package hospital_appointment.hospital_appointment.DTO;

import jakarta.validation.constraints.NotBlank;

public class UserResponseDTO {

  @NotBlank   
private int User_id;

private String email;
private String phone;
private String role;
private String name;


    public int getUser_id() {
        return this.User_id;
    }

    public void setUser_id(int User_id) {
        this.User_id = User_id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
