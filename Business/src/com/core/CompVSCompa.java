package com.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompVSCompa implements Comparable<CompVSCompa>{

	private int name;
	

	public CompVSCompa(int name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		
      List<CompVSCompa> li = new ArrayList<CompVSCompa>();
      li.add(new CompVSCompa(123));
      li.add(new CompVSCompa(400));
      li.add(new CompVSCompa(10));
      li.add(new CompVSCompa(250));

      CompVSCompa cp = null;
      Collections.sort(li);
      for(CompVSCompa c : li) {
    	  System.out.println(c.name);
      }
	}

	@Override
	public int compareTo(CompVSCompa a) {
		if(this.name == a.name) {
			return 0;}
		else if(this.name < a.name) {
			return 1;}
		else {
			return -1;}
	}
	}


