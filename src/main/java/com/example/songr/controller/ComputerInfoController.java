//package com.example.songr.controller;
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.HashMap;
//import java.util.Map;
//
//@Controller
//public class ComputerInfoController {
//
//    @GetMapping("/computer-info")
//    public String getComputerInfo(HttpServletRequest request, Map<String, String> model) {
//        String userAgent = request.getHeader("User-Agent");
//
//        String osInfo = request.getHeader("User-Agent");
//
//        String clientIpAddress = getClientIpAddress(request);
//
//
//        model.put("userAgent", userAgent);
//        model.put("osInfo", osInfo);
//        model.put("clientIpAddress", clientIpAddress);
//
//        return "computer-info";
//    }
//    private String getClientIpAddress(HttpServletRequest request) {
//        String ipAddress = request.getHeader("X-Forwarded-For");
//        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
//            ipAddress = request.getHeader("Proxy-Client-IP");
//        }
//        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
//            ipAddress = request.getHeader("WL-Proxy-Client-IP");
//        }
//        if (ipAddress == null || ipAddress.isEmpty() || "unknown".equalsIgnoreCase(ipAddress)) {
//            ipAddress = request.getRemoteAddr();
//        }
//        return ipAddress;
//    }
//}
