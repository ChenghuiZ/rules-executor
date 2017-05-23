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
public abstract class AbstractOperateRule implements IRule {

    @Override
    public RuleExecuteResult execute(Object obj) {
        Object newObj = operate(obj);
        return new RuleExecuteResult(EnumRuleResult.CONTINUE, newObj);
    }

    public abstract Object operate(Object obj);
}
