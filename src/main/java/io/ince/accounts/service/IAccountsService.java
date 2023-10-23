package io.ince.accounts.service;

import io.ince.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - mobile phone
     * @return CustomerDto
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * @param customerDto - CustomerDto Object
     * @return - boolean
     */
    boolean updateAccount(CustomerDto customerDto);
}
