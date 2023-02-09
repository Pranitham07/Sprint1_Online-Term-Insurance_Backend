package com.cg.OnlineTermInsurance.service;

import java.util.List;

 

import org.springframework.stereotype.Service;

 

import com.cg.OnlineTermInsurance.*;
import com.cg.OnlineTermInsurance.dto.PaymentsDTO;
@Service

 

public interface PaymentsService {
    public PaymentsDTO savePayment(PaymentsDTO paymentDTO);
    public PaymentsDTO updatePayment(PaymentsDTO paymentDTO);
    public List<PaymentsDTO> viewAllPaymentDetails();
	public PaymentsDTO getBypaymentId(int paymentId);

   

 

    

 

}