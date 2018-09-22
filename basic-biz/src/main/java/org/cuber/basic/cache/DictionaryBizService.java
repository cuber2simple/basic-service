package org.cuber.basic.cache;

import org.cuber.basic.cache.carrier.DictionaryCarrier;
import org.cuber.basic.facade.bridge.DictionaryBridge;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.basic.Dictionary;
import org.cuber.stub.rpc.Req;
import org.cuber.stub.rpc.Resp;
import org.cuber.stub.rpc.StubException;
import org.cuber.stub.util.RpcUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dictionaryBizService")
public class DictionaryBizService implements DictionaryBridge {

    @Autowired
    private DictionaryCarrier dictionaryCarrier;

    @Override
    public Resp<Dictionary> loadByKey(Req<Dictionary> req) throws StubException {
        RpcUtils.verifyVoNotNull(req);
        Dictionary dictionary = dictionaryCarrier.carryByKey(req.getReq());
        return RpcUtils.success(dictionary);
    }

    @Override
    public CacheDef loadDef() {
        return dictionaryCarrier.loadDef();
    }
}
