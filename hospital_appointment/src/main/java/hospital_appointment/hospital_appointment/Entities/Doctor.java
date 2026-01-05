package hospital_appointment.hospital_appointment.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Doctor {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String qualification;
    private String experience ;
    private boolean  availabilityStatus;
     

    @OneToOne
   @JoinColumn(name = "user_id", unique = true)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getDoc_Id() {
        return id;
    }

    public void setDoc_Id(int doc_Id) {
        this.id = doc_Id;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
    

}
