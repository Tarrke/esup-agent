/**
 * ESUP-Portail Commons - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-commons
 */
package org.esupportail.commons.services.database;

/**
 * An abstract class for non updatable database managers.
 */
@SuppressWarnings("serial")
public abstract class AbstractBasicDatabaseManager implements DatabaseManager {

	/**
	 * @see org.esupportail.commons.services.database.DatabaseManager#isUpgradable()
	 */
	public boolean isUpgradable() {
		return false;
	}
	
	/**
	 * @see org.esupportail.commons.services.database.DatabaseManager#create()
	 */
	public void create() {
		throw new UnsupportedOperationException(getClass().getCanonicalName() + ".create()");
	}
	
	/**
	 * @see org.esupportail.commons.services.database.DatabaseManager#upgrade()
	 */
	public void upgrade() {
		throw new UnsupportedOperationException(getClass().getCanonicalName() + ".upgrade()");
	}	

}
