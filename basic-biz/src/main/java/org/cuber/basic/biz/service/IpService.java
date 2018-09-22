package org.cuber.basic.biz.service;

import org.cuber.basic.vo.Ip;
import org.cuber.stub.rpc.StubException;
import org.springframework.web.multipart.MultipartFile;

public interface IpService {

    Ip load(String ipAddress) throws StubException;

    long insertBatch(MultipartFile request, boolean isIpv4) throws StubException;
}
