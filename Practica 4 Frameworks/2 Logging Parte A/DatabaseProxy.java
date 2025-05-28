package ar.edu.unlp.objetos.oo2.ProxyLoggin;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class DatabaseProxy implements DatabaseAccess{
	private DatabaseRealAccess realDB;
	private boolean access;
	private static final Logger logger = Logger.getLogger(DatabaseProxy.class.getName());
	
	public DatabaseProxy() {
		this.realDB = new DatabaseRealAccess();
	}

	public void setAccess(boolean access) {
		this.access = access;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.access) {
			logger.info("Acceso Valido para busquedas");
			return this.realDB.getSearchResults(queryString);
		}
		return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.access) {
			logger.warning("Acceso Valido para inserciones");
			return this.realDB.insertNewRow(rowData);
		}
		else {
			logger.severe("Acceso Invalido a la base de datos");
			return 0;
		}
	}

}
