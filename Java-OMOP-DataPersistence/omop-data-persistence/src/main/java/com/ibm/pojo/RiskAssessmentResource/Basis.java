package com.ibm.pojo.RiskAssessmentResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Basis {

    public String reference;

    public String getReference(){return reference;}
    public void setReference(String reference){this.reference=reference;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
