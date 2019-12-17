package com.qingcheng.service.goods;

import java.util.List;

public interface ImportSku {
    /**
     * 导入sku数据到es
     */
    public void importSkuList(List<Sku> sku);


}
