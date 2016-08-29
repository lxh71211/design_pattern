package xiaoxi;

/**
 * Mocha��װ���ߣ���չ��CondimentDecorator
 * CondimentDecorator��չ��Beverage
 * @author xiaoxi
 *
 */
public class Mocha extends CondimentDecorator {

	//��װ���ߣ���װ���߼�¼��ʵ��������
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
