package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.freelanceapp.dao.IBookmarkedFreelancerDao;
import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dao.IRecruiterDao;
import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
import com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.exceptions.InvalidBookmarkedFreelancerException;
import com.cg.freelanceapp.service.IBookmarkedFreelancerService;

//This is the Service Implementation for BookmarkedFreelancer module.	 
@Service
@Transactional
public class BookmarkedFreelancerServiceImpl implements IBookmarkedFreelancerService {

	@Autowired
	IBookmarkedFreelancerDao bookmarkedFreelancerDao;

	@Autowired
	ISkillDao skillDao;

	@Autowired
	IFreelancerDao freelancerDao;

	@Autowired
	IRecruiterDao recruiterDao;

    //This method creates a bookmark of an existing freelancer. 
	@Override
	public BookmarkedFreelancer bookmarkFreelancer(BookmarkedFreelancerDTO bookmarkedFreelancerDto) {

		BookmarkedFreelancer bookmarkedFreelancer = new BookmarkedFreelancer();

		if (recruiterDao.existsById(bookmarkedFreelancerDto.getRecruiterId())
				&& freelancerDao.existsById(bookmarkedFreelancerDto.getFreelancerId())) {

			bookmarkedFreelancer.setBookmarkedBy(recruiterDao.findById(bookmarkedFreelancerDto.getRecruiterId()).get());
			bookmarkedFreelancer.setFreelancer(freelancerDao.findById(bookmarkedFreelancerDto.getFreelancerId()).get());

			return bookmarkedFreelancerDao.save(bookmarkedFreelancer);
		} else
			throw new InvalidBookmarkedFreelancerException();

	}

	//This method deletes a Bookmarked Freelancer 
	@Override
	public void deleteBookmarkedFreelancerById(Long id) {
		if (bookmarkedFreelancerDao.existsById(id)) {
			bookmarkedFreelancerDao.deleteById(id);
		} else {
			throw new InvalidBookmarkedFreelancerException();
		}

	}

	
	//The method finds BookmarkedFreelancers by their Id, and returns a list.
	@Override
	public BookmarkedFreelancer findById(Long id) {
		if (bookmarkedFreelancerDao.existsById(id)) {
			return bookmarkedFreelancerDao.findById(id).get();
		} else
			throw new InvalidBookmarkedFreelancerException();

	}

    //This method returns the current value of primary key from the sequence.
	@Override
	public Long getCurrentId() {
		return bookmarkedFreelancerDao.getCurrentSeriesId();
	}

	//This method adds/saves a Bookmarked Freelancer
	@Override
	public BookmarkedFreelancer save(BookmarkedFreelancerDTO bookmarkedFreelancerDto) {
		BookmarkedFreelancer bookmarkedFreelancer = new BookmarkedFreelancer();
		bookmarkedFreelancer.setBookmarkedBy(recruiterDao.findById(bookmarkedFreelancerDto.getRecruiterId()).get());
		bookmarkedFreelancer.setFreelancer(freelancerDao.findById(bookmarkedFreelancerDto.getFreelancerId()).get());
		return bookmarkedFreelancerDao.save(bookmarkedFreelancer);
	}

	//This method fetches the List of all BookMarked Freelancer
	@Override
	public List<BookmarkedFreelancerListDTO> getAll() {
		return bookmarkedFreelancerDao.findAllDTO();
	}

}
