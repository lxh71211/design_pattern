package xiaoxi;

/**
 * 必须让CondimentDecorator能取代Beverage，所以将CondimentDecorator扩展自Beverage类
 * @author xiaoxi
 *
 */
public abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription();
}
