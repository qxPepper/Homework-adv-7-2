package ru.netology.domain_objects;

public class Treatment implements RepositoryTreatment {
    @Override
    public MedicalHistory treatmentMedicalHistory(MedicalHistory medicalHistory, String drugsAndOperations) {
        medicalHistory.setDrugsAndOperations(drugsAndOperations);
        return medicalHistory;
    }
}