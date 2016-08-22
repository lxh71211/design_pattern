package xiaoxi;

public abstract class Duck {
	//为行为接口类型声明两个引用变量，所有鸭子子类（在同一个package中）都继承它们
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	//调用接口方法
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	
	//设定方法--设定行为而不是在构造器内实例化
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
