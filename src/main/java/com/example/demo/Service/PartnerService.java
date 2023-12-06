package com.example.demo.Service;
import com.example.demo.DTO.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DTO.Partner;
import java.util.List;
@Service
public class PartnerService {

    private PartnerRepository partnerRepository;
    @Autowired
    public PartnerService(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    public List<Partner> findAllPartners() {
        return partnerRepository.findAll();
    }
}
