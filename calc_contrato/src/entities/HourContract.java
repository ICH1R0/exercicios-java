package entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {

    private LocalDate date;
    private double valuePairHour;
    private Integer hour;

    public HourContract(){};

    public HourContract(LocalDate date, double valuePairHour, Integer hour) {
        this.date = date;
        this.valuePairHour = valuePairHour;
        this.hour = hour;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValuePairHour() {
        return valuePairHour;
    }

    public void setValuePairHour(double valuePairHour) {
        this.valuePairHour = valuePairHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public double totalValue(){
        return valuePairHour * hour;
    }
}
