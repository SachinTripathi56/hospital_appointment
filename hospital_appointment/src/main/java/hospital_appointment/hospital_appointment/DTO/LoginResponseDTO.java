package hospital_appointment.hospital_appointment.DTO;

public class LoginResponseDTO {
    private int id ; 
    private String Username ;
    private String role;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    } 
}
