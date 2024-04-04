package com.nt.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor(access=AccessLevel.PUBLIC)//Default is also public
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CustomerType {
	@NonNull
    private int cno;
    private String cname;
   @NonNull
    private String cadd;
    private double billAmt;
 
}
