package review.abstractclass;

abstract class Cat {
	void clean() throws Exception {}
}

class Lion extends Cat {
	void clean() {}
}