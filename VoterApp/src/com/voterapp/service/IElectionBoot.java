package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;

public interface IElectionBoot {
	boolean checkEligibilty(int age,String locality, int voterId)throws InValidVoterException;
}
