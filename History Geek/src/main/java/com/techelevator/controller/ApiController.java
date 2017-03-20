package com.techelevator.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ApiController {

	/**
	 * ApiController allows us to separate our
	 * controllers that handle view logic from controllers that provide output to clients making
	 * asynchronous HTTP requests.
	 */
    // GET: Api
//    public String getTax(String billingZipCode, double subtotal) {
//        if (String.IsNullOrEmpty(billingZipCode)) {
//            return new HttpStatusCodeResult(System.Net.HttpStatusCode.BadRequest);
//        }
//
//        double taxRate = taxCalculator.GetTaxRate(billingZipCode);
//        double taxTotal = Math.Round(subtotal * taxRate, 2);         
//        return Json(taxTotal, JsonRequestBehavior.AllowGet);
//    }

}
