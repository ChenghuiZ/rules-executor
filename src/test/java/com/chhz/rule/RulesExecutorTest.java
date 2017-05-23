/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chhz.rule;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author zhongchenghui
 */
public class RulesExecutorTest {

    public RulesExecutorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testExecute() {
        System.out.println("execute");
        List<IRule> rules = new ArrayList<>();
        rules.add(new PlusFiveOperateRule());
        rules.add(new MultiplyTenOperateRule());
        RulesExecutor rulesExecutor = new RulesExecutor();
        rulesExecutor.setRules(rules);
        Object obj = 1;
        Object expResult = 60;
        Object result = rulesExecutor.execute(obj);
        assertEquals(expResult, result);
    }

    @Test
    public void testExecute2() {
        System.out.println("execute");
        List<IRule> rules = new ArrayList<>();
        rules.add(new PlusFiveOperateRule());
        rules.add(new FalseConditionRule());
        rules.add(new MultiplyTenOperateRule());
        RulesExecutor rulesExecutor = new RulesExecutor();
        rulesExecutor.setRules(rules);
        Object obj = 1;
        Object expResult = 6;
        Object result = rulesExecutor.execute(obj);
        assertEquals(expResult, result);
    }

    @Test
    public void testExecute3() {
        System.out.println("execute");
        List<IRule> rules = new ArrayList<>();
        rules.add(new FalseFilterRule());
        rules.add(new PlusFiveOperateRule());
        rules.add(new FalseConditionRule());
        rules.add(new MultiplyTenOperateRule());
        RulesExecutor rulesExecutor = new RulesExecutor();
        rulesExecutor.setRules(rules);
        Object obj = 1;
        Object expResult = null;
        Object result = rulesExecutor.execute(obj);
        assertEquals(expResult, result);
    }

    @Test
    public void testExecute4() {
        System.out.println("execute");
        List<IRule> rules = new ArrayList<>();
        rules.add(new TrueFilterRule());
        rules.add(new PlusFiveOperateRule());
        rules.add(new TrueConditionRule());
        rules.add(new MultiplyTenOperateRule());
        RulesExecutor rulesExecutor = new RulesExecutor();
        rulesExecutor.setRules(rules);
        Object obj = 1;
        Object expResult = 60;
        Object result = rulesExecutor.execute(obj);
        assertEquals(expResult, result);
    }

}
