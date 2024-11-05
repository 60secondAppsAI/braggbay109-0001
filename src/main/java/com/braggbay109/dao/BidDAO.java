package com.braggbay109.dao;

import java.util.List;

import com.braggbay109.dao.GenericDAO;
import com.braggbay109.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


