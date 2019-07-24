/**
 * 
 */
package org.ness.com.springav.service;

/**
 * @author P7108899
 *
 */
public interface CachingService {

	public void evictSingleCacheValue(String cacheName);
	
	public void evictAllCaches();
	
	public void evictAllcachesAtIntervals();
}
