package org.apache.dolphinscheduler.plugin.datasource.api.client;

import org.apache.dolphinscheduler.plugin.datasource.api.datasource.DataSourceProcessor;
import org.apache.dolphinscheduler.plugin.datasource.api.plugin.DataSourcePluginManager;
import org.apache.dolphinscheduler.plugin.datasource.api.plugin.DataSourceProcessorManager;
import org.junit.Test;

import java.util.Map;

public class DataSourcepluginManagerTest {
    DataSourceProcessorManager dataSourceProcessorManager = new DataSourceProcessorManager();

    @Test
    public void test(){
        dataSourceProcessorManager.installProcessor();
        Map<String, DataSourceProcessor> map = dataSourceProcessorManager.getDataSourceProcessorMap();
        System.out.println(map);
        map.forEach((k,v)->{
            System.out.println("key: " + k);
            System.out.println("value: " + v);
        });
    }
}
