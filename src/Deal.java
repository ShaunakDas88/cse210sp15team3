/**
 *  This is class is the deal object
 */
public class Deal {
	private String deal_name;
	private String vendor_name;
	private String type; 
	private List<Object> condition_list;
	private double discount;
	private double price;
	private Date  expire_date;
	
	/**
	 * Constructer of the Deal object
	 * 
	 * @param deal_name is the name of the deal
	 * @param vendor_name is the name of the vendor who create this deal
	 * @param type is the type of the deal
	 * @param condition is the condition of the deal
	 * @param discount is the discount of the price
	 * @param price show the price of the food
	 * @param expire_date specify when is this deal will expire
	 */
	public Deal(String deal_name,String vendor_name, String type, double discount, double price, Date expire_date, Object condition){
		this.deal_name=deal_name;
		this.vendor_name=vendor_name;
		this.condition_list= new ArrayList<Object>();
		condition_list.add(condition);
		this.type=type;
		this.discount=discount;
		this.price=price;
		this.expire_date=expire_date;

	}
	
	/**
	 * Edit the deal's deatail. Return true if edit successfully
	 * @param deal_name is the name of the deal
	 * @param vendor_name is the name of the vendor who create this deal
	 * @param type is the type of the deal
	 * @param discount is the discount of the price
	 * @param price show the price of the food
	 * @param expire_date specify when is this deal will expire
	 */
	public boolean edit(String deal_name,String vendor_name, String type, double discount, double price, Date expire_date){
		boolean success=false;
		this.deal_name=deal_name;
		this.vendor_name=vendor_name;
		this.type=type;
		this.discount=discount;
		this.price=price;
		this.expire_date=expire_date;
		success=true;
		return success;
	}
	
	/**
	 * addCondition to deal  Return true if addCondition successfully, false if deal is not existing
	 * 
	 * @param attribute is a object of the condition
	 * @return true if add successfully
	 */
	public boolean addCondition(Object condition){
		boolean success=true;
		this.condition_list.add(condition);
		success=true;
		return success;
	}
	/**
	 * removeCondition to deal  Return true if remove Condition successfully, false if this condition doesn't exist in the list
     *
	 * @param attribute is the name of the condition
	 * @return true if remove successfully
	 */
	public boolean removeCondition(Object condition){
		boolean success=true;
		return this.condition_list.remove(condition);

	}
}
