package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
	private DatabaseRealAccess realDB;
	private boolean access;
	
	public DatabaseProxy() {
		this.realDB = new DatabaseRealAccess();
	}

	public void setAccess(boolean access) {
		this.access = access;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.access) return this.realDB.getSearchResults(queryString);
		return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.access) return this.realDB.insertNewRow(rowData);
		return 0;
	}

}
