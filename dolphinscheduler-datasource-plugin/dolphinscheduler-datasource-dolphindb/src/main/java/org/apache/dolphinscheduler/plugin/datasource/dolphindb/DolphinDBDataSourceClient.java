package org.apache.dolphinscheduler.plugin.datasource.dolphindb;

import org.apache.dolphinscheduler.plugin.datasource.api.client.CommonDataSourceClient;
import org.apache.dolphinscheduler.spi.datasource.BaseConnectionParam;
import org.apache.dolphinscheduler.spi.enums.DbType;

public class DolphinDBDataSourceClient extends CommonDataSourceClient {
    public DolphinDBDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType) {
        super(baseConnectionParam, dbType);
    }

    @Override
    protected void checkUser(BaseConnectionParam baseConnectionParam) {

    }

    @Override
    protected void setDefaultUsername(BaseConnectionParam baseConnectionParam) {

    }
}
