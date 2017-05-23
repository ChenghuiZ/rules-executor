# rules-executor

<h3>该规则执行器中包含三种规则：</h3>
1.操作型规则（AbstractOperateRule）<br>
2.过滤型规则（AbstractFilterRule）<br>
3.条件型规则（AbstractConditionRule）
<p>
操作型规则：对输入的数据进行加工处理<br>
过滤型规则：符合条件的通过，继续执行后续的规则；否则丢弃，直接返回null<br>
条件型规则：符合条件的通过，继续执行后续的规则；否则返回当前中间状态的数据（即该规则之前其他规则加工过的结果）<br>
<p>
<h3>一个规则执行器（RulesExecutor）：</h3>
可以配置随机配置各种规则；
执行器执行规则按照配置的顺序逐一执行
<p>
<p>
PS:该规则执行器结合Spring一起使用，可在配置文件中灵活配置规则。