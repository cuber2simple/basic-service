package org.cuber.basic.biz.service;

import org.cuber.stub.basic.AppDef;

import java.util.List;

public interface AppDefBizService {
    List<AppDef> loadAll();

    void load2Zk();
}
