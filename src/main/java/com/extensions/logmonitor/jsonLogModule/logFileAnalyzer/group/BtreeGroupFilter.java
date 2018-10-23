package com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.group;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.UUID;

import org.javastack.kvstore.KVStoreFactory;
import org.javastack.kvstore.Options;
import org.javastack.kvstore.holders.DataHolder;
import org.javastack.kvstore.io.StringSerializer;
import org.javastack.kvstore.pool.StringPool;
import org.javastack.kvstore.structures.btree.BplusTree.TreeEntry;
import org.javastack.kvstore.structures.btree.BplusTreeFile;

import com.extensions.logmonitor.config.CommonConfig;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年10月19日
 * @Desc this guy is to lazy , noting left.
 *
 */
public class BtreeGroupFilter implements GroupFilter {

	KVStoreFactory<SelfStringHolder, GroupIdContact> factory = new KVStoreFactory<>(SelfStringHolder.class,
			GroupIdContact.class);
	BplusTreeFile<SelfStringHolder, GroupIdContact> tree = null; //

	public BtreeGroupFilter() {
		try {
			String templateFileName = UUID.randomUUID().toString().replaceAll("_", "") + ".data";
			File file = new File(CommonConfig.tempFilePath, templateFileName);
			file.deleteOnExit();
			Options opts = factory.createTreeOptionsDefault().set(KVStoreFactory.FILENAME, file.getAbsolutePath());
			this.tree = factory.createTreeFile(opts);
			this.tree.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initGroupId(String groupId, GroupIdContact groupIdContact) {
		this.tree.put(SelfStringHolder.valueOf(groupId), groupIdContact);
	}

	@Override
	public void havingResult(String groupId, boolean havingResult) {
		GroupIdContact groupIdContact = this.tree.get(SelfStringHolder.valueOf(groupId));
		if (groupIdContact != null) {
			groupIdContact.setNeedRemove(havingResult);
		}
	}

	@Override
	public GroupIdContact findGroupIdContact(String groupId) {
		return this.tree.get(SelfStringHolder.valueOf(groupId));
	}

	@Override
	public boolean filter(String groupId) {
		GroupIdContact groupIdContact = this.tree.get(SelfStringHolder.valueOf(groupId));
		return groupIdContact == null || groupIdContact.isNeedRemove();
	}

	public Iterator<GroupIdContact> iterator() {
		return new FilterIterator();
	}

	private class FilterIterator implements Iterator<GroupIdContact> {
		private Iterator<TreeEntry<SelfStringHolder, GroupIdContact>> treeIterator;

		public FilterIterator() {
			this.treeIterator = tree.iterator();
		}

		@Override
		public boolean hasNext() {
			return treeIterator.hasNext();
		}

		@Override
		public GroupIdContact next() {
			TreeEntry<SelfStringHolder, GroupIdContact> next = treeIterator.next();
			GroupIdContact value = next.getValue();
			return value.setGroupId(next.getKey().getValue());
		}
	}

	public static class SelfStringHolder extends DataHolder<SelfStringHolder> {

		private final String value;

		public static SelfStringHolder valueOf(final String value) {
			return new SelfStringHolder(StringPool.getCanonicalVersion(value));
		}

		/**
		 * Constructor necesario para la deserializacion
		 */
		public SelfStringHolder() {
			this("");
		};

		private SelfStringHolder(final String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		// ========= Basic Object methods =========

		@Override
		public String toString() {
			return value;
		}

		@Override
		public int hashCode() {
			return value.hashCode();
		}

		// ========= Comparable =========

		@Override
		public boolean equals(final Object obj) {
			if (obj instanceof SelfStringHolder) {
				return value.equals(((SelfStringHolder) obj).value);
			}
			return false;
		}

		@Override
		public int compareTo(final SelfStringHolder anotherString) {
			final String thisVal = this.value;
			final String anotherVal = anotherString.value;
			return thisVal.compareTo(anotherVal);
		}

		// ========= Serialization =========

		@Override
		public final int byteLength() {
			// md5取摘要后的固定长度
			return 32;
		}

		@Override
		public void serialize(final ByteBuffer buf) {
			StringSerializer.fromStringToBuffer(buf, value);
		}

		@Override
		public SelfStringHolder deserialize(final ByteBuffer buf) {
			return valueOf(StringSerializer.fromBufferToString(buf));
		}

	}

}
