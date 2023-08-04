package sakancom;

public class usedFurniture {
 private String descripton;
 private String []image;
 private double price;
 
 public usedFurniture(String d, String[] i,double p) {
	 this.descripton=d;
	 this.image=i;
	 this.price=p;
 }

public String getDescripton() {
	return descripton;
}

public void setDescripton(String descripton) {
	this.descripton = descripton;
}

public String[] getImage() {
	return image;
}

public void setImage(String[] image) {
	this.image = image;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
 
 
}
