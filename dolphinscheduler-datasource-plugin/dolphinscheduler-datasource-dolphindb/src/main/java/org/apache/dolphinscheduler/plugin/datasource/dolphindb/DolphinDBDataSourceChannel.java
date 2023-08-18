package org.apache.dolphinscheduler.plugin.datasource.dolphindb;

import org.apache.dolphinscheduler.spi.datasource.BaseConnectionParam;
import org.apache.dolphinscheduler.spi.datasource.DataSourceChannel;
import org.apache.dolphinscheduler.spi.datasource.DataSourceClient;
import org.apache.dolphinscheduler.spi.enums.DbType;

public class DolphinDBDataSourceChannel implements DataSourceChannel {
    @Override
    public DataSourceClient createDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType) {
        return new DolphinDBDataSourceClient(baseConnectionParam, dbType);
    }
}
