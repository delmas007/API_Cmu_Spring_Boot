package com.example.cmuspring.Service;

import com.example.cmuspring.Dto.DossierPatientDto;
import com.example.cmuspring.Model.DossierPatient;
import org.springframework.stereotype.Service;

@Service
public interface DossierPatientService {

    DossierPatientDto ajouerDossierPatient(DossierPatientDto dto);

    DossierPatientDto consulterDossierPatient(String numeroCmu);

    DossierPatientDto modifierDossierPatient(String numeroCmu,String antecedentsMedicaux,String historiqueVaccination,String resumesMedicaux);

    void supprimerDossierPatient(String numeroCmu);

}
