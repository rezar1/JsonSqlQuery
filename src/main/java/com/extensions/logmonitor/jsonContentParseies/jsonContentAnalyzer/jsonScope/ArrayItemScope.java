package com.extensions.logmonitor.jsonContentParseies.jsonContentAnalyzer.jsonScope;

import com.extensions.logmonitor.jsonContentParseies.jsonContentAnalyzer.jsonParserExecute.CheckPathInterface;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.scopes.BaseScope;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.scopes.Scope;
import com.extensions.logmonitor.util.GenericsUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年9月9日
 * @Desc this guy is to lazy , noting left.
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ArrayItemScope extends BaseScope implements CheckPathInterface {

	private boolean needDoHandle;
	private boolean needDoParseMore;

	private int index;

	public ArrayItemScope(Scope enclosingScope, int index) {
		super(enclosingScope);
		this.index = index;
	}

	@Override
	public String getScopeName() {
		String currentIndexStr = "[" + index + "]";
		return GenericsUtils.isNullOrEmpty(this.getEnclosingScope().getScopeName()) ? "" + currentIndexStr
				: this.getEnclosingScope().getScopeName() + currentIndexStr;
	}

	@Override
	public boolean needDoHandle() {
		return this.needDoHandle;
	}

	@Override
	public boolean needDoParseMore() {
		return this.needDoParseMore;
	}

}
