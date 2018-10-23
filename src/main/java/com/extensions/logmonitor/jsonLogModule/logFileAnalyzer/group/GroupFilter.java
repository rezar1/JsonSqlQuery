package com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.group;

import java.util.Iterator;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年10月19日
 * @Desc this guy is to lazy , noting left.
 *
 */
public interface GroupFilter {

	public void initGroupId(String groupId, GroupIdContact groupIdContact);

	public void havingResult(String groupId, boolean havingResult);

	public GroupIdContact findGroupIdContact(String groupId);

	public boolean filter(String groupId);

	public Iterator<GroupIdContact> iterator();

}
