INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,carrier_class,
is_global,is_durable,duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,
create_datetime) values (nextval('SEQ_CACHE_DEF'),'cache_def','basic-service','/cache/refresh/cache_def',
'cache::basic::cache_def','org.cuber.stub.basic.CacheDef','org.cuber.basic.facade.bridge.CacheDefBridge','org.cuber.basic.cache.carrier.CacheDefCarrier','true','false',null,null,'available','1','1',current_timestamp, current_timestamp);

INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,carrier_class,is_global,is_durable,
duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,create_datetime) values (
nextval('SEQ_CACHE_DEF'),'app_def','basic-service','/cache/refresh/app_def','cache::basic::app_def','org.cuber.stub.basic.AppDef',
'org.cuber.basic.facade.bridge.AppDefBridge','org.cuber.basic.cache.carrier.AppDefCarrier','true','false',null,null,'available','1','1',current_timestamp, current_timestamp);

INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,carrier_class,is_global,is_durable,
duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,create_datetime) values (
nextval('SEQ_CACHE_DEF'),'biz_table_def','basic-service','/cache/refresh/biz_table_def','cache::basic::biz_table_def','org.cuber.stub.basic.BizTableDef',
'org.cuber.basic.facade.bridge.BizTableDefBridge','org.cuber.basic.cache.carrier.BizTableDefCarrier','true','false',null,null,'available','1','1',current_timestamp, current_timestamp);

INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,carrier_class,is_global,is_durable,
duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,create_datetime) values (
nextval('SEQ_CACHE_DEF'),'country','basic-service','/cache/refresh/country','cache::basic::country','org.cuber.stub.basic.Country',
'org.cuber.basic.facade.bridge.CountryBridge','org.cuber.basic.cache.carrier.CountryCarrier','true','false',null,null,'available','1','1',current_timestamp, current_timestamp);

INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,carrier_class,is_global,is_durable,
duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,create_datetime) values (
nextval('SEQ_CACHE_DEF'),'currency','basic-service','/cache/refresh/currency','cache::basic::currency','org.cuber.stub.basic.Currency',
'org.cuber.basic.facade.bridge.CurrencyBridge','org.cuber.basic.cache.carrier.CurrencyCarrier','true','false',null,null,'available','1','1',current_timestamp, current_timestamp);

INSERT INTO t_cache_def(id,cache_name,app_name,cache_zk_path,cache_redis_key,cache_ins_class,bridge_class,carrier_class,is_global,is_durable,
duration_of_minutes,last_load_datetime,status,update_user_id,create_user_id,update_datetime,create_datetime) values (
nextval('SEQ_CACHE_DEF'),'dictionary','basic-service','/cache/refresh/dictionary','cache::basic::dictionary','org.cuber.stub.basic.Dictionary',
'org.cuber.basic.facade.bridge.DictionaryBridge','org.cuber.basic.cache.carrier.DictionaryCarrier','true','false',null,null,'available','1','1',current_timestamp, current_timestamp);
