package com.twisttech.employmanagement.Controller;

import com.twisttech.employmanagement.Model.EmpModel;
import com.twisttech.employmanagement.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class EmpController {

    @Autowired//service  ka bean
    EmpService service;


@GetMapping("/getEmpData")
    public List<EmpModel> getEmpData(){
   return service.getEmpData();

}
    @GetMapping("/getEmpById/{id}")
public Optional<EmpModel> getEmpById(@PathVariable int id)
{
    return service.getEmpById(id);
}


@PostMapping("/saveEmpData")
    public String saveEmpData(@RequestBody EmpModel model){
    service.saveEmpData(model);
    return "Employee data saved successfully";
}

@PutMapping("/updateEmpData")
    public EmpModel updateEmpData (@RequestBody EmpModel model)
{

    return service.updateEmpData(model);
}

@DeleteMapping("/deleteEmpData/{id}")
    public String deleteEmpData(@PathVariable int id){
    return service.deleteEmpData(id);
}

}
