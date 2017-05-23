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
public class RuleExecuteResult {

    public enum EnumRuleResult {
        CONTINUE,
        RETURN,
        ABANDON;
    }
    private EnumRuleResult enumRuleResult;
    private Object result;

    public RuleExecuteResult(EnumRuleResult enumRuleResult, Object result) {
        this.enumRuleResult = enumRuleResult;
        this.result = result;
    }

    public EnumRuleResult getEnumRuleResult() {
        return enumRuleResult;
    }

    public void setEnumRuleResult(EnumRuleResult enumRuleResult) {
        this.enumRuleResult = enumRuleResult;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

}
