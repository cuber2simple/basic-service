package org.cuber.basic.cache;

import org.cuber.basic.cache.carrier.BizTableDefCarrier;
import org.cuber.basic.facade.bridge.BizTableDefBridge;
import org.cuber.stub.basic.BizTableDef;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.rpc.Req;
import org.cuber.stub.rpc.Resp;
import org.cuber.stub.rpc.StubException;
import org.cuber.stub.util.RpcUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("bizTableDefBizService")
public class BizTableDefBizService implements BizTableDefBridge {

    @Autowired
    private BizTableDefCarrier bizTableDefCarrier;


    @Override
    public Resp<List<BizTableDef>> loadCacheByAppName(Req req) throws StubException {
        RpcUtils.verifyBase(req);
        return RpcUtils.success(bizTableDefCarrier.loadByAppName(req.getAppName()));
    }

    @Override
    public Resp<BizTableDef> loadByKey(Req<BizTableDef> req) throws StubException {
        RpcUtils.verifyVoNotNull(req);
        return RpcUtils.success(bizTableDefCarrier.carryByKey(req.getReq()));
    }

    @Override
    public CacheDef loadDef() {
        return bizTableDefCarrier.loadDef();
    }
}
