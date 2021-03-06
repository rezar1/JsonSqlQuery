package com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.select;

import java.util.concurrent.atomic.AtomicInteger;

import com.extensions.logmonitor.util.BloomFilter;
import com.extensions.logmonitor.util.LoadCache;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年9月7日
 * @Desc this guy is to lazy , noting left.
 *
 */
public class CountFunQueryExectue extends BaseQueryExecute<Integer> {

	private boolean distinct;
	private BloomFilter bloomFilter = new BloomFilter();
	private LoadCache<String, AtomicInteger> loadCache = new LoadCache<String, AtomicInteger>(
			new LoadCache.InitValue<String, AtomicInteger>() {
				@Override
				public AtomicInteger initValue(String key) {
					return new AtomicInteger(0);
				}
			});

	@Override
	public void execute(Object value, String groupId) {
		if (distinct) {
			synchronized (groupId == null ? CountFunQueryExectue.class : groupId) {
				if (bloomFilter.contains(value.toString())) {
					return;
				}
			}
		}
		loadCache.getCache(check(groupId)).incrementAndGet();
	}

	@Override
	public Integer end(String groupId) {
		return loadCache.getCache(check(groupId)).get();
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

}
