/**
 * 
 */
package org.ness.com.springav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author P7108899
 *
 */
@Service
public class CacheServiceImpl implements CachingService {

	@Autowired
	private CacheManager cacheManager;
	
	@Override
	public void evictAllCaches() {
		
		cacheManager.getCacheNames().stream().forEach(cacheName -> cacheManager.getCache(cacheName).clear());
	}

	@Override
	public void evictSingleCacheValue(String cacheName) {
		
		System.out.println("Inside CacheServiceImpl.evictSingleCacheValue method: " + cacheName);
		cacheManager.getCache(cacheName).clear();
	}

	@Scheduled(fixedRate = 6000)
	@Override
	public void evictAllcachesAtIntervals() {
		
		System.out.println("Inside CacheServiceImpl.evictAllcachesAtIntervals method:");
		
		evictAllCaches();
	}
}
