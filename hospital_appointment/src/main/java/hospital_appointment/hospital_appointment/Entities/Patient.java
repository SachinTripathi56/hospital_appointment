package hospital_appointment.hospital_appointment.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Patient  {
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO) 
   private int id;
   private int age;
   private String gender;
   private String bllodGoup;
   
   @OneToOne
   @JoinColumn(name = "user_id", unique = true)
   private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBllodGoup() {
        return bllodGoup;
    }

    public void setBllodGoup(String bllodGoup) {
        this.bllodGoup = bllodGoup;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
   
}
