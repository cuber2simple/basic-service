package org.cuber.basic.facade.rmi;

import org.cuber.basic.vo.Ip;
import org.cuber.stub.rpc.Req;
import org.cuber.stub.rpc.Resp;
import org.cuber.stub.rpc.StubException;

public interface IpFacade {

    Resp<Ip> load(Req<String> req) throws StubException;
}
