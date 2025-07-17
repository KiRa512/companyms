package com.kira.companyms.company.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "review-service", url = "localhost:8087")
public interface ReviewClient {
    @GetMapping("/reviews/avgRating")
    double getAverageRating(@RequestParam("companyId") Long companyId);
}
