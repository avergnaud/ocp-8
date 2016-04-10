package ch2.lambda;

@FunctionalInterface
interface IsA {
void test();
}

@FunctionalInterface
interface B extends IsA {}
