package singleton;

public class DatabaseConnection {
	
	// nestrpljivo učitavanje (eager loading)
	
	private static DatabaseConnection instance = new DatabaseConnection();

	private /*public*/ DatabaseConnection() {
		
	}
	
	// Implementacija konekcije nad određenom BP
	
	public static DatabaseConnection getInstance() {
		return instance;
	}
	
}
