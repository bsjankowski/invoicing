package project.firts.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
public class Invoices  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private long idInvoice;
    @Column(name = "number_invoice", nullable = false)
    private String numberInvoice;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "start_of_contractl", nullable = false)
    private String  startOfContractl;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "stop_of_contractl", nullable = false)
    private String  stopOfContractl;
    @Column(name = "cost_invoice", nullable = false)
    private double costInvoice;


    public Invoices(long idInvoice, String numberInvoice, String startOfContractl, String stopOfContractl, double costInvoice) {
        this.idInvoice = idInvoice;
        this.numberInvoice = numberInvoice;
        this.startOfContractl = startOfContractl;
        this.stopOfContractl = stopOfContractl;
        this.costInvoice = costInvoice;
    }

    public Invoices() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(long idInvoice) {
        this.idInvoice = idInvoice;
    }

    public String getNumberInvoice() {
        return numberInvoice;
    }

    public void setNumberInvoice(String numberInvoice) {
        this.numberInvoice = numberInvoice;
    }

    public String getStartOfContractl() {
        return startOfContractl;
    }

    public void setStartOfContractl(String startOfContractl) {
        this.startOfContractl = startOfContractl;
    }

    public String getStopOfContractl() {
        return stopOfContractl;
    }

    public void setStopOfContractl(String stopOfContractl) {
        this.stopOfContractl = stopOfContractl;
    }

    public double getCostInvoice() {
        return costInvoice;
    }

    public void setCostInvoice(double costInvoice) {
        this.costInvoice = costInvoice;
    }

    @Override
    public String toString() {
        return "Invoices{" +
                "id=" + id +
                ", idInvoice=" + idInvoice +
                ", numberInvoice='" + numberInvoice + '\'' +
                ", startOfContractl='" + startOfContractl + '\'' +
                ", stopOfContractl='" + stopOfContractl + '\'' +
                ", costInvoice=" + costInvoice +
                '}';
    }
}
