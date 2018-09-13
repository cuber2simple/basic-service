INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'basic-service','community server','1','8081','20001',null,null,'/basic','基础服务,国家,币种,字典,缓存等','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'union-sso','security server','1','8080','20000',null,null,'/sso','统一登陆权限','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'union-oauth','security server','1','8082','20002',null,null,'/oauth','认证服务中心','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'token-service','community server','1','8083','20003',null,null,'/token','token服务中心','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'union-card','security server','1','8084','20004',null,null,'/card','卡服务','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'workflow-service','community server','1','8085','20005',null,null,'/workflow','工作流服务','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'message-service','community server','1','8086','20006',null,null,'/message','消息中心','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'csr-server','operation server','1','8087','20007',null,null,'/csr','客户中心','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'chan-server','operation server','1','8088','20008',null,null,'/chan','渠道服务','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'channel-center','manager server','1','8089','20009',null,null,'/channel','渠道中心','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'order-server','operation server','1','8090','20010',null,null,'/order','订单服务','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'order-center','manager server','1','8091','20011',null,null,'/oc','订单中心','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'acct-server','operation server','1','8092','20012',null,null,'/acct','账户服务','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'acct-center','manager server','1','8093','20013',null,null,'/account','账户中心','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'cas-server','operation server','1','8094','20014',null,null,'/cas','清结算服务','1','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'cas-center','manager server','1','8095','20015',null,null,'/cass','清结算中心','1','1','1',current_timestamp,
current_timestamp);


INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,field_keys,
is_global,is_durable,duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,
create_datetime) values (nextval('SEQ_CACHE_DEF'),'cache_def','basic-service','/cache/refresh/cache_def',
'cache::basic::cache_def','org.cuber.stub.basic.CacheDef','org.cuber.basic.facade.bridge.CacheDefBridge',
'cacheZkPath;cacheName;cacheRedisKey;cacheInsClass;bridgeClass','Y','N',null,null,'1','1','1',current_timestamp, current_timestamp);

INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,field_keys,is_global,is_durable,
duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,create_datetime) values (
nextval('SEQ_CACHE_DEF'),'app_def','basic-service','/cache/refresh/app_def','cache::basic::app_def','org.cuber.stub.basic.AppDef',
'org.cuber.basic.facade.bridge.AppDefBridge','appName','Y','N',null,null,'1','1','1',current_timestamp, current_timestamp);

INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,field_keys,is_global,is_durable,
duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,create_datetime) values (
nextval('SEQ_CACHE_DEF'),'biz_table_def','basic-service','/cache/refresh/biz_table_def','cache::basic::biz_table_def','org.cuber.stub.basic.BizTableDef',
'org.cuber.basic.facade.bridge.BizTableDefBridge','tableName;tClass','Y','N',null,null,'1','1','1',current_timestamp, current_timestamp);

INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,field_keys,is_global,is_durable,
duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,create_datetime) values (
nextval('SEQ_CACHE_DEF'),'country','basic-service','/cache/refresh/country','cache::basic::country','org.cuber.stub.basic.Country',
'org.cuber.basic.facade.bridge.CountryBridge','alphaCode2;alphaCode3;numberCode','Y','N',null,null,'1','1','1',current_timestamp, current_timestamp);

INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,field_keys,is_global,is_durable,
duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,create_datetime) values (
nextval('SEQ_CACHE_DEF'),'currency','basic-service','/cache/refresh/currency','cache::basic::currency','org.cuber.stub.basic.Currency',
'org.cuber.basic.facade.bridge.CurrencyBridge','alphaCode;numberCode','Y','N',null,null,'1','1','1',current_timestamp, current_timestamp);

INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,field_keys,is_global,is_durable,
duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,create_datetime) values (
nextval('SEQ_CACHE_DEF'),'dictionary','basic-service','/cache/refresh/dictionary','cache::basic::dictionary','org.cuber.stub.basic.Dictionary',
'org.cuber.basic.facade.bridge.DictionaryBridge','dictName','Y','N',null,null,'1','1','1',current_timestamp, current_timestamp);

INSERT INTO t_biz_table_def(id,table_name,schema,app_name,t_class,pattern,biz_code,prefix,the_desc,is_sys,status,
update_user_id,create_user_id,create_datetime) values(nextval('SEQ_BIZ_TABLE_CONF'),'t_login_log','oss','union-sso',
'org.cuber.sso.dto.LoginLog','yyyy_MM',1,'LL','登陆日志的主键和分表配置','Y','1','1','1',current_timestamp);

INSERT INTO t_biz_table_def(id,table_name,schema,app_name,t_class,pattern,biz_code,prefix,the_desc,is_sys,status,
update_user_id,create_user_id,create_datetime) values(nextval('SEQ_BIZ_TABLE_CONF'),'t_operate_log','oss','union-sso',
'org.cuber.sso.dto.OperatorLog','yyyy_MM',1,'OL','登陆操作的主键和分表配置','Y','1','1','1',current_timestamp);

----
---ISO4217 下载  导入
----

----
---ISO3166 github查找下载  导入
----