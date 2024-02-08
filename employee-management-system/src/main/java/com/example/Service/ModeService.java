package com.example.Service;

import com.example.Input.ModeInput;
import com.example.entity.Department;
import com.example.entity.Mode;
import com.example.repository.DepartmentRepository;
import com.example.repository.ModeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeService {
    private ModeRepository modeRepository;

    @Autowired
    public ModeService(ModeRepository modeRepository) {
        this.modeRepository = modeRepository;
    }
    public List<Mode> findAllModes(){
        return modeRepository.findAll();
    }
    public Mode findModeByEmployeeId(Long id){ return modeRepository.findByEmployeeId(id);}

    public Mode addMode(ModeInput modeInput)
    {
        String modeName=modeInput.getModeName();
        Mode newMode=new Mode(modeName);
        return modeRepository.save(newMode);
    }

    public Mode updateModeByModeId(ModeInput modeInput){
        Mode mode=modeRepository.findById(modeInput.getModeId()).orElse(null);
        if(mode!=null){
            if(modeInput.getModeName()!=null)mode.setName(modeInput.getModeName());
        }
        return modeRepository.save(mode);
    }

    public void deleteModeById(Long id){
        modeRepository.deleteById(id);
    }

}
