package com.nagal.splitwise.models.split;

import com.nagal.splitwise.models.User;

public class ExactSplit extends Split{

	public ExactSplit(User user,double amount){
		super(user);
		this.amount=amount;
	}
}
