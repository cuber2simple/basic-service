package org.cuber.basic.cache;

import org.cuber.basic.cache.carrier.CurrencyCarrier;
import org.cuber.basic.facade.bridge.CurrencyBridge;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.basic.Currency;
import org.cuber.stub.rpc.Req;
import org.cuber.stub.rpc.Resp;
import org.cuber.stub.rpc.StubException;
import org.cuber.stub.util.RpcUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("currencyBizService")
public class CurrencyBizService implements CurrencyBridge {

    @Autowired
    private CurrencyCarrier currencyCarrier;

    @Override
    public Resp<Currency> loadByKey(Req<Currency> req) throws StubException {
        RpcUtils.verifyVoNotNull(req);
        return RpcUtils.success(currencyCarrier.carryByKey(req.getReq()));
    }

    @Override
    public CacheDef loadDef() {
        return currencyCarrier.loadDef();
    }
}
