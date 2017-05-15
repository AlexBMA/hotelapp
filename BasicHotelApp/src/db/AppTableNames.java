package db;

public final class AppTableNames {
	
	/**
	 * 
	 * @author Alexandru
	 *
	 */
	public abstract class ServiceOptionEntry{
		
		public final static String TABLE_NAME="service_options";
		
		public final static String COLUMN_ID="id";
		public final static String COLUMN_NAME="name";
		public final static String  COLUMN_POSITION="position";
	}
	
	public abstract class ServiceOptionPriceServiceOptionEntry{
		
		public final static String TABLE_NAME="service_option_price_service_option";
		
		public final static String COLUMN_ID_SERVICE_OPTION="id_service_option";
		public final static String COLUMN_ID_PRICE_SERVICE_OPTION="id_price_service_option";
		
	}
	
	public abstract class PriceForServiceOptionEntry{
		public final static String TABLE_NAME="price_service_option";
		
		public final static String COLUMN_ID ="id";
		public final static String COLUMN_VALUE="value";
		public final static String COLUMN_CURRENCY_ID="currency_id";
		public final static String COLUMN_DATE_FROM="date_from";
		public final static String COLUMN_DATE_TO="date_to";
		public final static String COLUMN_PARTICIPANT_TYPE_ID="participant_type_id";
	}
	
	public abstract class MyCurrencyEntry{
		public final static String TABLE_NAME="currencies";
		
		public final static String COLUMN_ID ="id";
		public final static String COLUMN_NAME="name";
	}
	
	public abstract class ParticiapntTypeEntry{
		
		public final static String TABLE_NAME="participant_type";
		
		public final static String COLUMN_ID ="id";
		public final static String COLUMN_NAME="name";
		
	}

}
