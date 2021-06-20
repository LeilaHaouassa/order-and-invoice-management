package com.proxym.ordermanagement.entity;


import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Embeddable;
import javax.validation.constraints.Pattern;


//"An instance of time that occurs every day."
@Embeddable
public class TimeType {

    @Pattern(regexp = "^-*[^T:-]+:.+$")
    @DateTimeFormat
    private  String timeContent;

    public TimeType() {
    }

    public String getTimeContent() {
        return timeContent;
    }

    public void setTimeContent(String timeContent) {
        this.timeContent = timeContent;
    }
}
