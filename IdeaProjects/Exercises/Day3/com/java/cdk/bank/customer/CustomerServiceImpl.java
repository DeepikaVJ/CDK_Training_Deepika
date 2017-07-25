package com.java.cdk.bank.customer;

import com.java.cdk.bank.account.*;

public class CustomerServiceImpl extends AccountServiceImpl implements CustomerService {
	void details() {
        getDetails();
    }

    void updateAddress(String newAdress) {
        setAddress(newAdress);
    }

    void updateMobile(long mobile) {
        setMobile(mobile);
    }
}

