package hospital_appointment.hospital_appointment.DTO;

public class DoctorResponseDTO {
    
    private String DocId;
    private String name;
     private String qualification;
    private String experience ;
    private boolean  availabilityStatus;

    public String getDocId() {
        return this.DocId;
    }

    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExperience() {
        return this.experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public boolean isAvailabilityStatus() {
        return this.availabilityStatus;
    }

    public boolean getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }


}
