 class GoodDog {
	
	 private int size;
	 
	 public int getSize() {
		 return size;
	 }
	 
	 public void setSize(int s) {
		 size=s;
	 }

	 void bark() {
		 if(size>50) {
			 System.out.println("Woof! Woof");
		 }
		 else if (size >14) {
		 	System.out.println("Ruff! Ruff");
		 }
	 else {
		 System.out.println("Yip Yip");
	 	}
	
	 }
}
