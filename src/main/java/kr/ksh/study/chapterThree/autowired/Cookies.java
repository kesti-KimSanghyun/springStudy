package kr.ksh.study.chapterThree.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert{
	Dessert dessert = null;

	@Autowired
	public void setDessert(Dessert dessert){
		this.dessert = dessert;
	}
}

