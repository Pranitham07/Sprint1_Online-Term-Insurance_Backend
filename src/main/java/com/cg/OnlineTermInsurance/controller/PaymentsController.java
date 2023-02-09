package com.cg.OnlineTermInsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.OnlineTermInsurance.dto.PaymentsDTO;
import com.cg.OnlineTermInsurance.exception.PaymentsNotFoundException;
import com.cg.OnlineTermInsurance.service.PaymentsService;

@RestController
@RequestMapping("/api/payments")
public class PaymentsController {
    @Autowired
    private PaymentsService paymentsService;
    @PostMapping
    public ResponseEntity<PaymentsDTO>savePayments(@RequestBody PaymentsDTO paymentDTO){
        PaymentsDTO payment=paymentsService.savePayment(paymentDTO);
        return ResponseEntity.ok(payment);
    }
    @GetMapping("/{paymentId}")
    public ResponseEntity<PaymentsDTO>getBypaymentId(@PathVariable int paymentId){
        PaymentsDTO payment = paymentsService.getBypaymentId(paymentId);
        return new ResponseEntity<PaymentsDTO>(payment,HttpStatus.FOUND);

    }
    @PutMapping
    public ResponseEntity<PaymentsDTO>updatePayment(@RequestBody PaymentsDTO paymentsDTO){
        PaymentsDTO payment=paymentsService.updatePayment(paymentsDTO);

            return ResponseEntity.ok(payment);

        }
    
    @GetMapping
    public ResponseEntity<List<PaymentsDTO>>getAllPaymentDetails(){
        List<PaymentsDTO>list=paymentsService.viewAllPaymentDetails();
        return ResponseEntity.ok(list);
    }
    
 

}
