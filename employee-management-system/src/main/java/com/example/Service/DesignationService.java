package com.example.Service;

import com.example.Input.DesignationInput;
import com.example.entity.Designation;
import com.example.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DesignationService {
    private DesignationRepository designationRepository;

    @Autowired
    public DesignationService(DesignationRepository designationRepository) {this.designationRepository = designationRepository; }
    public List<Designation> findAllDesignations() { return designationRepository.findAll(); }
    public Designation findDesignationByEmployeeId(Long id){
        return designationRepository.findByEmployeeId(id);
    }

    public Designation addDesignation(DesignationInput designationInput)
    {
        String designationName=designationInput.getDesignationName();
        Designation newDesignation =new Designation(designationName);
        return designationRepository.save(newDesignation);
    }

    public Designation updateDesignation(DesignationInput designationInput)
    {
        Designation designation=designationRepository.findById(designationInput.getDesignationId()).orElse(null);
        if(designation!=null)
        {
            if(designationInput.getDesignationName()!=null) designation.setName(designationInput.getDesignationName());
        }
        return designationRepository.save(designation);
    }
    public void deleteDesignation(Long id){
        designationRepository.deleteById(id);
    }
}
