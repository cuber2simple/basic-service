package org.cuber.basic.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.cuber.basic.biz.service.IpService;
import org.cuber.basic.vo.Ip;
import org.cuber.stub.controller.BaseController;
import org.cuber.stub.rpc.Resp;
import org.cuber.stub.rpc.StubException;
import org.cuber.stub.util.RpcUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Api(value = "ip接口", tags = "ip接口")
@RequestMapping("/ip")
@Controller
public class IpController extends BaseController {

    @Autowired
    private IpService ipService;


    @ApiOperation(value = "查找IP")
    @RequestMapping(value = "/{ip}")
    @ResponseBody
    public Resp<Ip> fetch(@PathVariable("ip") String ip) throws StubException {
        Ip result = ipService.load(ip);
        return RpcUtils.success(result);
    }


    @ApiOperation("导入IP库ipType=ipv4 代表ipv4  使用别的代表ipv6")
    @RequestMapping(value = "/loadIp/{ipType}", method = RequestMethod.POST)
    @ResponseBody
    public Resp<Long> loadIp(@ApiParam("gzip压缩的CSV") MultipartFile file,
                             @PathVariable("ipType") String ipType) throws StubException {
        boolean isIpv4 = "ipv4".equals(ipType);
        long count = ipService.insertBatch(file, isIpv4);
        return RpcUtils.success(count);
    }
}
