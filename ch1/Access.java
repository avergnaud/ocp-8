package ch1;
public class Access {

int var1;
static int var2;

class InstanceInn {
	private int var3 = var1;
}

static class StaticNested {
	private int var4 = var2;
	int var5 = new Access().var1;
}

int var6 = new StaticNested().var4;
int var7 = new InstanceInn().var3;

}
