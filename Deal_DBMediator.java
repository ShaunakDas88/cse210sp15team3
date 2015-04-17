/**
 *  This is class is in charge of communication with DB
 */
public class Deal_DBMediator {
	
	Deal_DBMediator()
	{
		//TODO build connection
	}
	
	/**
	 * add a new deal to database. Return true if add successfully, false if deal already existing
	 * or DB connection fails.
	 * 
	 * @param deal this is the new deal
	 * @return true if add successfully
	 */
	public boolean db_add(Deal deal)
	{
		//TODO
		boolean success = true;
		
		
		return success;
	}
	
	/**
	 * edit a deal in the database. Return true if edited successfully, false if deal is not existing
	 * or DB connection fails or doesn't have this attribute
	 * 
	 * @param deal_name is the name of the deal
	 * @param attribute is the attribute needed to be modified 
	 * @param value is the new value. Can only be string, double, time, boolean
	 * @return true if edited successfully
	 */
	public boolean db_edit(String deal_name, String attribute, Object value)
	{
		//TODO
		boolean success = true;
		
		
		return success;
	}
	
	/**
	 * delete a deal in the database. Return true if delete successfully, false if deal is not existing
	 * or DB connection fails.
	 * 
	 * @param deal_name is the name of the deal
	 * @return true if delete successfully
	 */
	public boolean db_delete(String deal_name)
	{
		//TODO
		boolean success = true;
		
		
		return success;
	}
	
	/**
	 * addCondition to deal in the database. Return true if addCondition successfully, false if deal is not existing
	 * or DB connection fails.
	 * If the attribute is not existing, add a new attribute.
	 * If the attribute is existing, will override with new value.
	 * 
	 * @param deal_name is the name of the deal
	 * @param attribute is the name of the condition
	 * @param value is the condition value. Can only be string, double, time, boolean
	 * @return true if delete successfully
	 */
	public boolean db_addCondition(String deal_name, String attribute, Object value)
	{
		//TODO
		boolean success = true;
		
		
		return success;
	}
}
