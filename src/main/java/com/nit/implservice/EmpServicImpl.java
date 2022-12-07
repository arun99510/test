package com.nit.implservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Iservice.IEmpServive;
import com.nit.entity.EmpModel;
import com.nit.repo.EmpRepo;

@Service
public class EmpServicImpl implements IEmpServive {

	@Autowired
	private EmpRepo repo;

	@Override
	public String saveEmp(EmpModel model) {
		EmpModel save = repo.save(model);
		return "success";
	}

	@Override
	public List<EmpModel> getAllEmp() {
		return repo.findAll();
	}

	@Override
	public EmpModel getOneEmp(Integer regNo) {
		Optional<EmpModel> findById = repo.findById(regNo);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteEmp(Integer regNo) {

		repo.deleteById(regNo);
		return "Sucess";
	}

}
