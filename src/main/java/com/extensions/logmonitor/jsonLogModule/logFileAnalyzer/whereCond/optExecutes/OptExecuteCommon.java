package com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.whereCond.optExecutes;

import java.util.List;

import com.extensions.logmonitor.exceptions.WrongMatchTypeException;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.functions.valueConvert.ValueConvert;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.whereCond.OptExecute;
import com.extensions.logmonitor.util.GenericsUtils;
import com.extensions.logmonitor.util.LoadCache;
import com.extensions.logmonitor.util.LoadCache.InitValue;
import com.extensions.logmonitor.util.SqlLikePattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年9月4日
 * @Desc this guy is to lazy , noting left.
 *
 */
@Slf4j
public abstract class OptExecuteCommon<M> implements OptExecute {

	private static InitValue<String, SqlLikePattern> initValue = new InitValue<String, SqlLikePattern>() {
		@Override
		public SqlLikePattern initValue(String originPatternStr) {
			return new SqlLikePattern(originPatternStr);
		}
	};
	private static LoadCache<String, SqlLikePattern> patternCache = new LoadCache<>(initValue);

	protected M matchValue;
	private boolean isArray;
	private boolean isSelfCall;
	private String matchPath;
	private ValueConvert valueConvert;

	/**
	* 
	*/
	public OptExecuteCommon(M matchValue) {
		this.matchValue = matchValue;
		this.isArray = GenericsUtils.isArrays(this.matchValue);
	}

	@Override
	public void setMatchPath(String path) {
		this.matchPath = path;
	}

	@Override
	public String getMatchPath() {
		return this.matchPath;
	}

	@Override
	public void setValueConvert(ValueConvert valueConvert) {
		this.valueConvert = valueConvert;
	}

	/**
	 * @return
	 */
	protected abstract String getOptType();

	@Override
	public boolean isArrayAllCheck() {
		return false;
	}

	@Override
	public void setArrayAllCheck(boolean isArrayAllCheck) {
		// TODO
	}

	@Override
	public boolean isSelfCall() {
		return this.isSelfCall;
	}

	@Override
	public void setIsSelfCall(boolean isSelfCall) {
		this.isSelfCall = true;
	}

	@Override
	public boolean OptSuccess(Object value) {
		// log.debug("{} and matchValue is:{} ", this.toString(), value);
		boolean result = false;
		if (this.matchValue == null) {
			result = compareAsNull(value);
		} else {
			if (this.valueConvert != null) {
				value = this.valueConvert.convert(value);
			}
			if (this.isArray) {
				result = compareAsArray(value);
			} else {
				result = singleValueMatch(this.matchValue, value);
			}
		}
		return result;
	}

	/**
	 * 
	 * 有bug,后面再弄吧 ,空值的判断
	 * 
	 * @param value
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private boolean compareAsArray(Object value) {
		if (this.getOptType() == in || this.getOptType() == notIn || this.getOptType() == between
				|| this.getOptType() == notBetween) {
			if (value instanceof String) {
				return this.arrayOptMatch((List<String>) this.matchValue, value.toString());
			} else if (value instanceof Integer) {
				return this.arrayOptMatch((List<Integer>) this.matchValue, Integer.parseInt(value.toString()));
			} else if (value instanceof Double) {
				return this.arrayOptMatch((List<Double>) this.matchValue, Double.parseDouble(value.toString()));
			}
		}
		log.warn("not support type:{}", value.getClass());
		return false;
	}

	public <T> boolean arrayOptMatch(List<T> matchColl, Comparable<T> value) {
		switch (this.getOptType()) {
		case in:
			return matchColl.contains(value);
		case notIn:
			return !matchColl.contains(value);
		case between:
			return value.compareTo(matchColl.get(0)) >= 0 && value.compareTo(matchColl.get(1)) <= 0;
		case notBetween:
			return !(value.compareTo(matchColl.get(0)) >= 0 && value.compareTo(matchColl.get(1)) <= 0);
		default:
			throw new WrongMatchTypeException(this.getOptType(), value, null);
		}
	}

	/**
	 * @param value
	 * @param value2
	 */
	private boolean singleValueMatch(Object matchValue, Object value) {
		if (value instanceof String) {
			return compareAsString(matchValue.toString(), value.toString());
		} else if (value instanceof Integer) {
			return this.compareAsInt(Integer.parseInt(matchValue.toString()), Integer.parseInt(value.toString()));
		} else if (value instanceof Double) {
			return this.compareAsDouble(Double.parseDouble(matchValue.toString()),
					Double.parseDouble(value.toString()));
		} else if (value instanceof Boolean) {
			return this.compareasBoolean(Boolean.parseBoolean(matchValue.toString()),
					Boolean.parseBoolean(value.toString()));
		} else if (value == null) {
			return this.compareAsNullWithTryToMatch();
		} else {
			throw new WrongMatchTypeException(this.getOptType(), matchValue, null);
		}
	}

	/**
	 * @param value
	 * @return
	 */
	private boolean compareAsNullWithTryToMatch() {
		switch (this.getOptType()) {
		case eq:
			return false;
		case notEq:
			return true;
		case lt:
			return true;
		case gt:
			return false;
		case gte:
			return false;
		case lte:
			return true;
		case like:
			return false;
		case notLike:
			return true;
		default:
			throw new WrongMatchTypeException(this.getOptType(), matchValue, null);
		}
	}

	public static void main(String[] args) {
		OptExecuteCommon<String> opt = new OptExecuteCommon<String>("name") {
			@Override
			protected String getOptType() {
				return "=";
			}
		};
		opt.singleValueMatch("zmt", null);
	}

	/**
	 * @param parseBoolean
	 * @param parseBoolean2
	 * @return
	 */
	private boolean compareasBoolean(boolean valueArgu, boolean valueTryToMatch) {
		switch (this.getOptType()) {
		case is:
			return valueArgu == valueTryToMatch;
		case isNot:
			return valueArgu != valueTryToMatch;
		default:
			throw new WrongMatchTypeException(this.getOptType(), matchValue, null);
		}
	}

	/**
	 * @param parseDouble
	 * @return
	 */
	private boolean compareAsDouble(Double valueArgu, Double valueTryToMatch) {
		double sqlValue = valueArgu.doubleValue();
		double tryToMatchValue = valueTryToMatch.doubleValue();
		switch (this.getOptType()) {
		case eq:
			return tryToMatchValue == sqlValue;
		case notEq:
			return tryToMatchValue != sqlValue;
		case lt:
			return tryToMatchValue < sqlValue;
		case gt:
			return tryToMatchValue > sqlValue;
		case gte:
			return tryToMatchValue >= sqlValue;
		case lte:
			return tryToMatchValue <= sqlValue;
		default:
			throw new WrongMatchTypeException(this.getOptType(), matchValue, null);
		}
	}

	/**
	 * @param value
	 * @param string
	 * @return
	 */
	private boolean compareAsString(String valueArgu, String valueTryToMatch) {
		switch (this.getOptType()) {
		case eq:
			return valueTryToMatch.compareTo(valueArgu) == 0;
		case notEq:
			return valueTryToMatch.compareTo(valueArgu) != 0;
		case lt:
			return valueTryToMatch.compareTo(valueArgu) < 0;
		case gt:
			return valueTryToMatch.compareTo(valueArgu) > 0;
		case gte:
			return valueTryToMatch.compareTo(valueArgu) >= 0;
		case lte:
			return valueTryToMatch.compareTo(valueArgu) <= 0;
		case like:
			return patternCache.getCache(valueArgu).match(valueTryToMatch);
		case notLike:
			return !patternCache.getCache(valueArgu).match(valueTryToMatch);
		default:
			throw new WrongMatchTypeException(this.getOptType(), matchValue, null);
		}
	}

	/**
	 * @param value
	 * @return
	 */
	private boolean compareAsNull(Object value) {
		if (this.getOptType() == isNull) {
			return value == null;
		} else if (this.getOptType() == isNotNull) {
			return value != null;
		} else {
			return false;
		}
	}

	public boolean compareAsInt(int valueArgu, int valueTryToMatch) {
		return this.compareAsDouble((double) valueArgu, (double) valueTryToMatch);
	}

	@Override
	public String toString() {
		return this.matchPath + " " + this.getOptType() + " " + this.matchValue;
	}

}
