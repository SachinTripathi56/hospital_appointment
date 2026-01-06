package hospital_appointment.hospital_appointment.DTO;

public class DoctorRequestDTO {
    private int id;
    
 private String qualification;
    private String experience ;
    private  String availabilityStatus;

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

   

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

}
