package com.kira.companyms.company.impl;


import com.kira.companyms.company.Company;
import com.kira.companyms.company.CompanyRepo;
import com.kira.companyms.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyRepo companyRepo;

    public CompanyServiceImpl(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    @Override
    public List<Company> getAllCompanies(){
        return companyRepo.findAll();

    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepo.findById(id).orElseThrow(()-> new RuntimeException("Company not found with id: " + id));
    }

    @Override
    public Company createCompany(Company company) {
        return companyRepo.save(company);
    }

    @Override
    public boolean updateCompany(Long id, Company updatedCompany) {
        Optional<Company> existingCompany = companyRepo.findById(id);
        if (existingCompany.isPresent()) {
            Company company = existingCompany.get();
            company.setName(updatedCompany.getName());
            company.setDescription(updatedCompany.getDescription());
            companyRepo.save(company);
            return true;
        } else {
            throw new RuntimeException("Company not found with id: " + id);
        }
    }

    @Override
    public void deleteCompany(Long id) {
        if (!companyRepo.existsById(id)) {
            throw new RuntimeException("Company not found with id: " + id);
        }
        companyRepo.deleteById(id);

    }
}
