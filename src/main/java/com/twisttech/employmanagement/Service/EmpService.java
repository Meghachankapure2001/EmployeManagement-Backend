package com.twisttech.employmanagement.Service;

import com.twisttech.employmanagement.Model.EmpModel;
import com.twisttech.employmanagement.dao.EmpDaoLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    EmpDaoLayer dao;


    public String saveEmpData(EmpModel model){

        dao.save(model);

        return "Employee data saved successfully";


    }

    public List<EmpModel> getEmpData() {

        return dao.findAll();
    }
    public EmpModel updateEmpData(EmpModel model){


        return dao.save(model);

    }

    public String deleteEmpData(int id) {

         dao.deleteById(id);
        return "deleted successfully";
    }

    public Optional<EmpModel> getEmpById(int id) {

       return dao.findById(id);
    }
}
