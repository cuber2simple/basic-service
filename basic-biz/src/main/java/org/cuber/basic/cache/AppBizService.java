package org.cuber.basic.cache;

import org.cuber.basic.cache.carrier.AppDefCarrier;
import org.cuber.basic.facade.bridge.AppDefBridge;
import org.cuber.stub.basic.AppDef;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.rpc.Req;
import org.cuber.stub.rpc.Resp;
import org.cuber.stub.rpc.StubException;
import org.cuber.stub.util.RpcUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("appBizService")
public class AppBizService implements AppDefBridge {

    @Autowired
    private AppDefCarrier appDefCarrier;

    @Override
    public AppDef loadSelf(Req req) throws StubException {
        RpcUtils.verifyBase(req);
        return appDefCarrier.loadByAppName(req.getAppName());
    }

    @Override
    public Resp<AppDef> loadByKey(Req<AppDef> req) throws StubException {
        RpcUtils.verifyVoNotNull(req);
        return RpcUtils.success(appDefCarrier.carryByKey(req.getReq()));
    }

    @Override
    public CacheDef loadDef() {
        return appDefCarrier.loadDef();
    }
}
