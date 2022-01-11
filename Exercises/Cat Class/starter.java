class cat {
	String name;
	
	public cat() {
		name = "Garfield";
	}
	public cat(String a) {
		name = a;
	}
	public void meow() {
		System.out.println(name + " meows!");
		return;
	}
}

class starter {
	
	public static void main(String args[]) {
		cat x = new cat();
		cat y = new cat("Generic Cat Name");
		x.meow();
		y.meow();
	}
}
