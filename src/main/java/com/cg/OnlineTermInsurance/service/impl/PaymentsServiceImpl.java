package com.cg.OnlineTermInsurance.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.OnlineTermInsurance.dto.PaymentsDTO;
import com.cg.OnlineTermInsurance.entity.Payments;
import com.cg.OnlineTermInsurance.exception.PaymentsNotFoundException;
import com.cg.OnlineTermInsurance.repository.PaymentsRepository;
import com.cg.OnlineTermInsurance.service.PaymentsService;

@Service
public class PaymentsServiceImpl implements PaymentsService {
    @Autowired
    private PaymentsRepository repository;

 

    @Override
    public PaymentsDTO savePayment(PaymentsDTO paymentsDTO) {
        // TODO Auto-generated method stub
        Payments payments = new Payments();
        BeanUtils.copyProperties(paymentsDTO, payments);
        repository.save(payments);
        return paymentsDTO;
    }

 

    @Override
    public PaymentsDTO updatePayment(PaymentsDTO paymentsDTO) {
        // TODO Auto-generated method stub
        Payments payments = new Payments();
        BeanUtils.copyProperties(paymentsDTO, payments);
        repository.save(payments);
        return paymentsDTO;
    }
    @Override
    public PaymentsDTO getBypaymentId(int paymentId) {
        // TODO Auto-generated method stub
        Optional<Payments> payment = repository.findById(paymentId);
        if (payment.isPresent()) {
            PaymentsDTO dto = new PaymentsDTO();
            BeanUtils.copyProperties(payment.get(), dto);
            return dto;
        }
        throw new PaymentsNotFoundException("Payment with id" + paymentId + "doesn't exist");

    }

 

    @Override
    public List<PaymentsDTO> viewAllPaymentDetails() {
        // TODO Auto-generated method stub
        Iterable<Payments>list = repository.findAll();        
        List<PaymentsDTO>dtos=new ArrayList<>();
        for(Payments payment:list) {
        PaymentsDTO dto=new PaymentsDTO();
        BeanUtils.copyProperties(payment, dto);
        dtos.add(dto);
        }
        return dtos;

 

}

 

 

    

 

}
