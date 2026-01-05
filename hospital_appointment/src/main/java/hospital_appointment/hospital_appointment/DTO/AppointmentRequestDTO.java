package hospital_appointment.hospital_appointment.DTO;

import java.time.LocalDate;
import java.time.LocalTime;


public class AppointmentRequestDTO {
  private LocalDate appnt_Date;
  private LocalTime appnt_time;

  private int patient_id;
  private int doctor_id;
   private String title;
  public AppointmentRequestDTO(){};
  public LocalDate getAppnt_Date() {
    return appnt_Date;
  }
  public void setAppnt_Date(LocalDate appnt_Date) {
    this.appnt_Date = appnt_Date;
  }
  public LocalTime getAppnt_time() {
    return appnt_time;
  }
  public void setAppnt_time(LocalTime appnt_time) {
    this.appnt_time = appnt_time;
  }
  public int getPatient_id() {
    return patient_id;
  }
  public void setPatient_id(int patient_id) {
    this.patient_id = patient_id;
  }
  public int getDoctor_id() {
    return doctor_id;
  }
  public void setDoctor_id(int doctor_id) {
    this.doctor_id = doctor_id;
  }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

  


}
