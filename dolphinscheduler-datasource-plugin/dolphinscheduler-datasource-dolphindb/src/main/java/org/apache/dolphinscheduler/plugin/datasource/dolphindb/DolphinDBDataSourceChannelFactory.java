package org.apache.dolphinscheduler.plugin.datasource.dolphindb;

import com.google.auto.service.AutoService;
import org.apache.dolphinscheduler.spi.datasource.DataSourceChannel;
import org.apache.dolphinscheduler.spi.datasource.DataSourceChannelFactory;

@AutoService(DataSourceChannelFactory.class)
public class DolphinDBDataSourceChannelFactory implements DataSourceChannelFactory {
    @Override
    public DataSourceChannel create() {
        return new DolphinDBDataSourceChannel();
    }

    @Override
    public String getName() {
        return "dolphindb";
    }
}
