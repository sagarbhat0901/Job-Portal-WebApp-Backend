package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IWorkTypeDao;
import com.cg.freelanceapp.entities.WorkType;
import com.cg.freelanceapp.service.IWorkTypeService;

@Service
@Transactional
public class WorkTypeServiceImpl implements IWorkTypeService {

	@Autowired
	IWorkTypeDao workTypeDao;
	
	@Override
	public WorkType getWorkType(Long work_id) {
		return workTypeDao.getOne(work_id);
	}
	
	@Override
    public Long getCurrentId() {
	return workTypeDao.getCurrentSeriesId();
		}
	
	@Override
	public List<WorkType> getAllWorkTypes() {
		return workTypeDao.findAll();
	}
	}


