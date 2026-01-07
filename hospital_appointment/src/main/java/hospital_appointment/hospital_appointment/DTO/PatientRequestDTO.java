package hospital_appointment.hospital_appointment.DTO;

public class PatientRequestDTO {
    private int id;
    private int age;
   private String gender;
   private String bloodGroup;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBllodGoup() {
        return this.bloodGroup;
    }

    public void setBllodGoup(String bllodGoup) {
        this.bloodGroup = bllodGoup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
