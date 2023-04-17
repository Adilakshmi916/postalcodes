package com.springboot.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	
	    private static final long serialVersionUID=1L;
	    private String resourceName;
	    private String fieldName;
	    private Object fieldValue;
	    
		public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
			super(String.format("%S not found with %S: '%S'",resourceName,fieldName,fieldValue));
			this.resourceName = resourceName;
			this.fieldName = fieldName;
			this.fieldValue = fieldValue;
		}
		public String getResourceName() {
			return resourceName;
		}
	    
		public String getfieldName() {
			return fieldName;
       
}
		public Object getfieldValue() {
			return fieldValue;
	
}
}
