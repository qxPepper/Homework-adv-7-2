package ru.netology.domain_objects;

public class Diagnostics implements RepositoryDiagnostics {
    @Override
    public MedicalHistory diagnoseMedicalHistory(MedicalHistory medicalHistory, String symptoms) {
        medicalHistory.setSymptoms(symptoms);
        return medicalHistory;
    }
}
