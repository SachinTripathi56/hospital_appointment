package hospital_appointment.hospital_appointment.Entities;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private LocalDate appnt_dat;
private LocalTime appnt_Time;

private String booking_status;

private String title;

@ManyToOne
@JoinColumn(name = "doctor_id", nullable = false)
private Doctor doctor;

@ManyToOne
@JoinColumn(name = "patient_id", nullable = false)
private Patient patient;

    public LocalDate getAppnt_dat() {
        return appnt_dat;
    }

    public void setAppnt_dat(LocalDate appnt_dat) {
        this.appnt_dat = appnt_dat;
    }

    public LocalTime getAppnt_Time() {
        return appnt_Time;
    }

    public void setAppnt_Time(LocalTime appnt_Time) {
        this.appnt_Time = appnt_Time;
    }

    public String getBooking_status() {
        return booking_status;
    }

    public void setBooking_status(String booking_status) {
        this.booking_status = booking_status;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
