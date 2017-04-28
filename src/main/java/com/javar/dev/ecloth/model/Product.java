package com.javar.dev.ecloth.model;

import java.util.Date;
import java.util.List;

public class Product {

	private int productId;
	private String productName;
	private String description;
	private List<String> listOfImage;
	private Category category;
	private SubCategory subCategory;
	private List<Feature> listOfFeature;
	private List<GeneralFeature> listOfGeneralFeature;
	private double discount;
	private double price;
	private double finalPrice;
	private int quantity;
	private Date dateAdded;
	
}
