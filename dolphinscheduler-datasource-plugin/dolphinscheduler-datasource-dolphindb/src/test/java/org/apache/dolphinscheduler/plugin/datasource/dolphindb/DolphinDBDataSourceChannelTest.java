package org.apache.dolphinscheduler.plugin.datasource.dolphindb;

import org.apache.dolphinscheduler.plugin.datasource.dolphindb.param.DolphinDBConnectionParam;
import org.apache.dolphinscheduler.spi.enums.DbType;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

public class DolphinDBDataSourceChannelTest {
    @Test
    public void testCreateDataSourceClient(){
        DolphinDBDataSourceChannel sourceChannel = PowerMockito.mock(DolphinDBDataSourceChannel.class);
        DolphinDBDataSourceClient dataSourceClient = PowerMockito.mock(DolphinDBDataSourceClient.class);
        PowerMockito.when(sourceChannel.createDataSourceClient(Mockito.any(), Mockito.any())).thenReturn(dataSourceClient);
        Assert.assertNotNull(sourceChannel.createDataSourceClient(new DolphinDBConnectionParam(), DbType.DOLPHINDB));
    }
}
