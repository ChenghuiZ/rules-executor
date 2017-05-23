/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chhz.rule;

/**
 *
 * @author zhongchenghui
 */
public abstract class AbstractFilterRule implements IRule {

    @Override
    public RuleExecuteResult execute(Object obj) {
        if (filter(obj)) {
            return new RuleExecuteResult(RuleExecuteResult.EnumRuleResult.CONTINUE, obj);
        } else {
            return new RuleExecuteResult(RuleExecuteResult.EnumRuleResult.ABANDON, null);
        }
    }

    public abstract boolean filter(Object obj);

}
