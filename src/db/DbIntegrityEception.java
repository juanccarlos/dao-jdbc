package db;

public class DbIntegrityEception extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	public DbIntegrityEception (String msg) {
		super(msg);
	}

}
