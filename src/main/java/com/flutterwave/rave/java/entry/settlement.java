///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.flutterwave.rave.java.entry;
//
//import com.flutterwave.rave.java.config.raveConfig;
//import com.flutterwave.rave.java.payload.settlementpayload;
//import com.flutterwave.rave.java.service.settlementServices;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import org.json.JSONObject;
//
///**
// *
// * @author cleopatradouglas
// */
//public class settlement {
//    
//     @POST
//    @Path("virtualcard/search/v1")
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Produces(MediaType.APPLICATION_JSON)
//    public String dosettlement(settlementpayload settlementpayload) {
//        settlementServices settlementservices = new settlementServices();
//        
////        settlementpayload.setSeckey(raveConfig.SECRET_KEY);
//        
//        String payload = new JSONObject(settlementpayload).toString();
//        String response = settlementservices.dosettlement(payload, settlementpayload);
//        return response;
//    }
//    
//}
