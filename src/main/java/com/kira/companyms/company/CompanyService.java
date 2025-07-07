package com.kira.companyms.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
    Company createCompany(Company company);
    boolean updateCompany(Long id, Company company);
    void deleteCompany(Long id);
}
