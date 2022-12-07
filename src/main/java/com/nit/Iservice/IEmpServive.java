package com.nit.Iservice;

import java.util.List;

import com.nit.entity.EmpModel;

public interface IEmpServive {
public String saveEmp(EmpModel model);
public List<EmpModel> getAllEmp();
public EmpModel getOneEmp(Integer regNo);
public String deleteEmp(Integer regNo);


	
}
