package hospital_appointment.hospital_appointment.DTO;

public class AppointmentResponseDTO {
    
private String doctor_name;
private int appnt_id;
private String patient_name;
private int patient_Id;
private int doctor_Id;


private String Status;
public String getDoctor_name() {
    return doctor_name;
}
public void setDoctor_name(String doctor_name) {
    this.doctor_name = doctor_name;
}
public int getAppnt_id() {
    return appnt_id;
}
public void setAppnt_id(int appnt_id) {
    this.appnt_id = appnt_id;
}
public String getPatient_name() {
    return patient_name;
}
public void setPatient_name(String patient_name) {
    this.patient_name = patient_name;
}
public String getStatus() {
    return Status;
}
public void setStatus(String status) {
    Status = status;
}

    public int getPatient_Id() {
        return patient_Id;
    }

    public void setPatient_Id(int patient_Id) {
        this.patient_Id = patient_Id;
    }

    public int getDoctor_Id() {
        return doctor_Id;
    }

    public void setDoctor_Id(int doctor_Id) {
        this.doctor_Id = doctor_Id;
    }

}
