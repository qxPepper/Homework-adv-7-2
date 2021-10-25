package ru.netology.domain_objects;

public class Reception implements RepositoryReception {
    @Override
    public MedicalHistory newMedicalHistory() {
        return new MedicalHistory("", "", "");
    }
}
