package org.cuber.basic.cache;

import org.cuber.basic.cache.carrier.CountryCarrier;
import org.cuber.basic.facade.bridge.CountryBridge;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.basic.Country;
import org.cuber.stub.rpc.Req;
import org.cuber.stub.rpc.Resp;
import org.cuber.stub.rpc.StubException;
import org.cuber.stub.util.RpcUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("countryBizService")
public class CountryBizService implements CountryBridge {

    @Autowired
    private CountryCarrier countryCarrier;

    @Override
    public Resp<Country> loadByKey(Req<Country> req) throws StubException {
        RpcUtils.verifyVoNotNull(req);
        return RpcUtils.success(countryCarrier.carryByKey(req.getReq()));
    }

    @Override
    public CacheDef loadDef() {
        return countryCarrier.loadDef();
    }
}
