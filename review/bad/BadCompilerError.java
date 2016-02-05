package review.bad;

class Parent {
	static final void myMethod() {
		/*
		static methods cannot be overriden, just hidden.
		they are associated with class rather than instance
		*/
	}
}

class Enfant extends Parent {
	static void myMethod() {
		/*
		hiding
		*/
	}
}
