INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'basic-service','community server','1','8081','20001',null,null,'/basic','基础服务,国家,币种,字典,缓存等','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'union-sso','security server','1','8080','20000',null,null,'/sso','统一登陆权限','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'union-oauth','security server','1','8082','20002',null,null,'/oauth','认证服务中心','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'token-service','community server','1','8083','20003',null,null,'/token','token服务中心','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'union-card','security server','1','8084','20004',null,null,'/card','卡服务','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'workflow-service','community server','1','8085','20005',null,null,'/workflow','工作流服务','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'message-service','community server','1','8086','20006',null,null,'/message','消息中心','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'csr-server','operation server','1','8087','20007',null,null,'/csr','客户中心','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'chan-server','operation server','1','8088','20008',null,null,'/chan','渠道服务','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'channel-center','manager server','1','8089','20009',null,null,'/channel','渠道中心','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'order-server','operation server','1','8090','20010',null,null,'/order','订单服务','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'order-center','manager server','1','8091','20011',null,null,'/oc','订单中心','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'acct-server','operation server','1','8092','20012',null,null,'/acct','账户服务','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'acct-center','manager server','1','8093','20013',null,null,'/account','账户中心','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'cas-server','operation server','1','8094','20014',null,null,'/cas','清结算服务','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'cas-center','manager server','1','8095','20015',null,null,'/cass','清结算中心','available','1','1',current_timestamp,
current_timestamp);

INSERT INTO t_app_def(id,app_name,group_name,own_user_id,server_port,dubbo_port,ext_setting,ext1_setting,
context_path,app_desc,status,update_user_id,create_user_id,update_datetime,create_datetime) values(nextval('SEQ_APP_DEF'),
'common','common setting','1','8096','20016',null,null,'/common','基础设置,数据库连接池,redis,kafka等一般设置','available','1','1',current_timestamp,
current_timestamp);