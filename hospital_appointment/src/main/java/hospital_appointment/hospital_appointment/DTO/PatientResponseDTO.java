package hospital_appointment.hospital_appointment.DTO;

public class PatientResponseDTO {
   
   private int id;
   private int age;
   private String name;
   private String gender;
   private String bllodGoup;

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
        return this.bllodGoup;
    }

    public void setBllodGoup(String bllodGoup) {
        this.bllodGoup = bllodGoup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
