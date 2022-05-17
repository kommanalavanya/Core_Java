package ai.jobiak.enums;

public enum Mobile {
	Apple(3000), Google(4000), Samsung(9000);

	int price;

	Mobile(int price) {
		this.price = price;
	}

	int showPrice() {
		return this.price;
	}

}
