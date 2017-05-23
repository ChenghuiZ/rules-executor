/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chhz.rule;

import java.util.List;

/**
 *
 * @author zhongchenghui
 */
public class RulesExecutor {

    List<IRule> rules;

    public Object execute(Object obj) {
        Object newObj = obj;
        label:
        for (IRule rule : rules) {
            RuleExecuteResult ruleExecuteResult = rule.execute(newObj);
            newObj = ruleExecuteResult.getResult();
            switch (ruleExecuteResult.getEnumRuleResult()) {
                case CONTINUE:
                    break;
                case RETURN:
                    break label;
                case ABANDON:
                    return newObj;
            }
        }
        return newObj;
    }

    public List<IRule> getRules() {
        return rules;
    }

    public void setRules(List<IRule> rules) {
        this.rules = rules;
    }

}
