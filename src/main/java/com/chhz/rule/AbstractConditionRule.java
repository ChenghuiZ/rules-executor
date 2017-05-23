/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chhz.rule;

import com.chhz.rule.RuleExecuteResult.EnumRuleResult;

/**
 *
 * @author zhongchenghui
 */
public abstract class AbstractConditionRule implements IRule {

    @Override
    public RuleExecuteResult execute(Object obj) {
        if (judge(obj)) {
            return new RuleExecuteResult(EnumRuleResult.CONTINUE, obj);
        } else {
            return new RuleExecuteResult(EnumRuleResult.RETURN, obj);
        }
    }

    public abstract boolean judge(Object obj);

}
