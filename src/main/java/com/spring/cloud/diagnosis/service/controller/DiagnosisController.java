/**
 * 
 */
package com.spring.cloud.diagnosis.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rashe
 *
 */
@RestController
public class DiagnosisController {

	@GetMapping("/getDiagnosis")
	public String getDiagnosisService() {
		return "Diagnosis microservice called";
	}
}
