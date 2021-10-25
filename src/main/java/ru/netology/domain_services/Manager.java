package ru.netology.domain_services;

import ru.netology.domain_objects.*;

public class Manager {

    public MedicalHistory firstVisit() {
        Reception reception = new Reception();
        return reception.newMedicalHistory();
    }

    public MedicalHistory diagnose(MedicalHistory medicalHistory, String symptoms) {
        Diagnostics diagnostics = new Diagnostics();
        return diagnostics.diagnoseMedicalHistory(medicalHistory, symptoms);
    }

    public MedicalHistory treatment(MedicalHistory medicalHistory, String drugsAndOperations) {
        Treatment treatments = new Treatment();
        return treatments.treatmentMedicalHistory(medicalHistory, drugsAndOperations);
    }

    public MedicalHistory tracking(MedicalHistory medicalHistory, String treatmentStatus) {
        Tracking track = new Tracking();
        return track.trackingMedicalHistory(medicalHistory, treatmentStatus);
    }
}
