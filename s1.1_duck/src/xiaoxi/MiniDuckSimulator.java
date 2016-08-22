package xiaoxi;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("--------------------------------------");
		
		Duck model = new ModelDuck();
		model.performFly();//调用方法会委托给flyBehavior对象，该对象在ModelDuck中设置
		model.setFlyBehavior(new FlyRocketPowered());//动态改变
		model.performFly();
	}

}
