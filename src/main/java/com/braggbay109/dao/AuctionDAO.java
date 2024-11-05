package com.braggbay109.dao;

import java.util.List;

import com.braggbay109.dao.GenericDAO;
import com.braggbay109.domain.Auction;





public interface AuctionDAO extends GenericDAO<Auction, Integer> {
  
	List<Auction> findAll();
	






}


