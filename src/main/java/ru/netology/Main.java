package ru.netology;

import ru.netology.domain_objects.MedicalHistory;
import ru.netology.domain_services.Manager;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, MedicalHistory> medicalHistories = new HashMap<>();

        boolean[] fistVisitArray = {true, true, false, false, false};
        String[] animalNicknameArray = {"Бобик", "Шарик", "Бобик", "Бобик", "Бобик"};
        String[] symptomsArray = {"Плохо видит", "Сломал лапу", "Плохо видит", "Плохо видит", "Хорошо видит"};
        String[] drugsAndOperationsArray = {"Глазные капли", "Наложили гипс", "Глазные капли", "Глазные капли", "Нет"};
        String[] treatmentStatusArray = {"Заболел", "Лечится", "Лечится", "Лечится", "Выздоровел"};

        //В цикле печатаем текущие карты историй болезней.
        for (int i = 0; i < fistVisitArray.length; i++) {
            medicalHistories = clinic(medicalHistories, fistVisitArray[i], animalNicknameArray[i], symptomsArray[i],
                    drugsAndOperationsArray[i], treatmentStatusArray[i]);
            System.out.println(medicalHistories);
            System.out.println();
        }

        //Последняя карта историй болезней.
        System.out.println("------------------------");
        System.out.println(medicalHistories);
    }

    public static Map<String, MedicalHistory> clinic(Map<String, MedicalHistory> medicalHistories, boolean fistVisit,
                                                     String animalNickname, String symptoms,
                                                     String drugsAndOperations, String treatmentStatus) {
        MedicalHistory medicalHistory;
        Manager manager = new Manager();

        if (fistVisit) {
            medicalHistory = manager.firstVisit();
            medicalHistories.put(animalNickname, medicalHistory);
        }

        medicalHistory = medicalHistories.get(animalNickname);

        medicalHistory = manager.diagnose(medicalHistory, symptoms);
        medicalHistory = manager.treatment(medicalHistory, drugsAndOperations);
        medicalHistory = manager.tracking(medicalHistory, treatmentStatus);

        medicalHistories.put(animalNickname, medicalHistory);

        return medicalHistories;
    }
}
