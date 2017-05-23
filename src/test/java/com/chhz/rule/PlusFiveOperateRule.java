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
public class PlusFiveOperateRule extends AbstractOperateRule {

    @Override
    public Object operate(Object bean) {
        int result = (int) bean + 5;
        return result;
    }

}
