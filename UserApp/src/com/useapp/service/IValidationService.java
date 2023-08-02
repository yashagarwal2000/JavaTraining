package com.useapp.service;

import com.useapp.exception.NameExistException;

public interface IValidationService {
	boolean vaidateUsername(String username)throws NameExistException;
	
}
