package com.exception;

class PaymentException extends Exception
{
	public PaymentException(String message)
	{
		super(message);
	}
	
}
class PaymentService
{
	public void paymentProcess(double payment)throws PaymentException{
		if(payment<=0)
		{
			throw new PaymentException("Invalid Payment:"+payment);
		}
	}
		
}
public class PaymentApp
{
	public static void main(String[] args) {
		
		PaymentService paymentService = new PaymentService();
        
        try {
            // Attempt to process a payment
            paymentService.paymentProcess(-9); 
        } catch (PaymentException e) {
            // Handle the PaymentException
            System.out.println("Payment processing failed: " + e.getMessage());
            
        }
    }
}