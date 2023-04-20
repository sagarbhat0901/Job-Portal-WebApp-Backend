package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IQualificationRequiredDao;
import com.cg.freelanceapp.entities.QualificationRequired;
import com.cg.freelanceapp.service.IQualificationRequiredService;


@Service
@Transactional
public class QualificationRequiredServiceImpl implements IQualificationRequiredService {

	
	@Autowired
	IQualificationRequiredDao qualificationRequiredDao;
	
	@Override
	public Long getCurrentId() {
		// TODO Auto-generated method stub
		return qualificationRequiredDao.getCurrentSeriesId();
	}

	@Override
	public QualificationRequired getQualificationRequired(Long qualification_id) {
		return qualificationRequiredDao.getOne(qualification_id);
	}

	@Override
	public List<QualificationRequired> getAllQualificationRequireds() {
		return qualificationRequiredDao.findAll();
	}

}
