package ru.netology.domain_objects;

public class MedicalHistory {
    private String symptoms;
    private String drugsAndOperations;
    private String treatmentStatus;

    public MedicalHistory(String symptoms, String drugsAndOperations, String treatmentStatus) {
        this.symptoms = symptoms;
        this.drugsAndOperations = drugsAndOperations;
        this.treatmentStatus = treatmentStatus;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public void setDrugsAndOperations(String drugsAndOperations) {
        this.drugsAndOperations = drugsAndOperations;
    }

    public void setTreatmentStatus(String treatmentStatus) {
        this.treatmentStatus = treatmentStatus;
    }

    @Override
    public String toString() {
        return "Симптом: " + symptoms + ", " +
                "Препараты и операции: " + drugsAndOperations + ", " +
                "Статус лечения: " + treatmentStatus + " ";
    }
}

