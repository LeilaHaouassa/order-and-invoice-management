package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

//A class to describe a period of time."
@Embeddable
public class Period {
    //"The date on which this period begins."
    private DateType startDate;
    //"The time at which this period begins."
    private TimeType startTime;
    //"The date on which this period ends."
    private DateType endDate;
    //"The time at which this period ends."
    private TimeType endTime;
    //"The duration of this period, expressed as an ISO 8601 code."
    private MeasureType durationMeasure;
    //"A description of this period, expressed as a code."
    @Size(min = 1)
    private Set<CodeType> descriptionCode = new HashSet<>();
    //"A description of this period, expressed as text."
    @Size(min = 1)
    private Set<TextType> description = new HashSet<>();



}
