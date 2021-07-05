package singleTonePattern;

public class AppConfig {

	private AppConfig () {
		
	}
	
//	AppConfig SingleTone = new AppConfig(); : As this object is going open even if there is no need of creating so there's an optimization.
	
	private static AppConfig SingleTone = null;
	
	public static AppConfig getInstance () {
		
		if (SingleTone == null) {
			
			SingleTone =  new AppConfig(); // Initialized only when called else no memory will be allocated...Optimization.
		}
		return SingleTone;
		
	}
}
