package ru.netology.domain_objects;

public class Tracking implements RepositoryTracking {
    @Override
    public MedicalHistory trackingMedicalHistory(MedicalHistory medicalHistory, String treatmentStatus) {
        medicalHistory.setTreatmentStatus(treatmentStatus);
        return medicalHistory;
    }
}