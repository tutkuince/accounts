package io.ince.accounts.service;

import io.ince.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);
}
