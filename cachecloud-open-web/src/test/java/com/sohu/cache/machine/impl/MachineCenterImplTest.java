package com.sohu.cache.machine.impl;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangbing on 2017/7/24.
 */
public class MachineCenterImplTest {
    @Test
    public void createRemoteFile() throws Exception {
        MachineCenterImpl machineCenter = new MachineCenterImpl();
        machineCenter.createRemoteFile("127.0.0.1", "12345", Lists.newArrayList("Hello world"));
    }

}