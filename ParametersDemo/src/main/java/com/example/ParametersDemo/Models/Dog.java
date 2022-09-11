package com.example.ParametersDemo.Models;

public class Dog {

	private int dogId;
	private String dogName;
	private String dogBreed;

	public String getDogBreed() {
		return dogBreed;
	}

	public int getDogId() {
		return dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}

	public void setDogId(int dogId) {
		this.dogId = dogId;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	@Override
	public String toString() {
		return "Dog [dogId=" + dogId + ", dogName=" + dogName + ", dogBreed=" + dogBreed + "]";
	}

}
