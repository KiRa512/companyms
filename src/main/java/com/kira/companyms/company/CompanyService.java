package com.kira.companyms.company;

import com.kira.companyms.dto.ReviewMessage;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
    Company createCompany(Company company);
    boolean updateCompany(Long id, Company company);
    void deleteCompany(Long id);
    void updateCompanyRating(ReviewMessage reviewMessage); // This method is used to update the company rating based on the review message
}
