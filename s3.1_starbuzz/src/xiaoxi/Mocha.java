package xiaoxi;

/**
 * Mocha是装饰者，扩展自CondimentDecorator
 * CondimentDecorator扩展自Beverage
 * @author xiaoxi
 *
 */
public class Mocha extends CondimentDecorator {

	//被装饰者，被装饰者记录到实例变量中
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
