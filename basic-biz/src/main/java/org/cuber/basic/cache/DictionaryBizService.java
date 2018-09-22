package org.cuber.basic.cache;

import org.cuber.basic.facade.bridge.DictionaryBridge;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.basic.Dictionary;
import org.cuber.stub.rpc.Req;
import org.cuber.stub.rpc.Resp;
import org.cuber.stub.rpc.StubException;
import org.springframework.stereotype.Service;

@Service("dictionaryBizService")
public class DictionaryBizService implements DictionaryBridge {
    @Override
    public Resp<Dictionary> loadByKey(Req<Dictionary> req) throws StubException {
        return null;
    }

    @Override
    public CacheDef loadDef() {
        return null;
    }
}
