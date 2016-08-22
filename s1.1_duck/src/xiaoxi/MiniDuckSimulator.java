package xiaoxi;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("--------------------------------------");
		
		Duck model = new ModelDuck();
		model.performFly();//���÷�����ί�и�flyBehavior���󣬸ö�����ModelDuck������
		model.setFlyBehavior(new FlyRocketPowered());//��̬�ı�
		model.performFly();
	}

}
