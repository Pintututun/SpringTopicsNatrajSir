package com.nt.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class CustomerUsingDataAnnotation {
	@NonNull
   private int cno;
   private String cname;
   private String cadd;
   private double billAmt;
}
