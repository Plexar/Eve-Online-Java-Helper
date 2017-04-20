package eu.burbach.eve.wormholes.serviceimpl;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface WormholeServiceImpl extends Remote {
	
    /**
     * Login user into server
     * @param user
     * @param password
     * @return token
     * @throws RemoteException
     */
	public String login(String user, String password) throws RemoteException;

	/**
	 * Logout user
	 * @param token
	 * @return true: succeeded
	 * @throws RemoteException
	 */
	public boolean logout(String token) throws RemoteException;

	/**
	 * get server version string
	 * @param token
	 * @return
	 * @throws RemoteException
	 */
	public String version(String token) throws RemoteException;
		
	public void registerSystem(String token, String name);

}
