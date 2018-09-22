package org.cuber.basic.biz;

import org.cuber.basic.biz.service.IpService;
import org.cuber.basic.facade.rmi.IpFacade;
import org.cuber.basic.vo.Ip;
import org.cuber.stub.rpc.Req;
import org.cuber.stub.rpc.Resp;
import org.cuber.stub.rpc.StubException;
import org.cuber.stub.util.RpcUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ipFacade")
public class IpFacadeImpl implements IpFacade {

    @Autowired
    private IpService ipService;

    @Override
    public Resp<Ip> load(Req<String> req) throws StubException {
        RpcUtils.verifyVoNotNull(req);
        Ip result = ipService.load(req.getReq());
        return RpcUtils.success(result);
    }
}
