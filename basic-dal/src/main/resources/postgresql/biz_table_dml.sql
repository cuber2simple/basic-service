INSERT INTO t_biz_table_def(id,table_name,schema_name,app_name,t_class,pattern,biz_code,prefix,the_desc,is_sys,status,
update_user_id,create_user_id,create_datetime) values(nextval('SEQ_BIZ_TABLE_CONF'),'t_login_log','oss','union-sso',
'org.cuber.sso.dto.LoginLog','yyyy_MM',1,'LL','登陆日志的主键和分表配置','true','available','1','1',current_timestamp);

INSERT INTO t_biz_table_def(id,table_name,schema_name,app_name,t_class,pattern,biz_code,prefix,the_desc,is_sys,status,
update_user_id,create_user_id,create_datetime) values(nextval('SEQ_BIZ_TABLE_CONF'),'t_operate_log','oss','union-sso',
'org.cuber.sso.dto.OperateLog','yyyy_MM',2,'OL','登陆操作的主键和分表配置','true','available','1','1',current_timestamp);