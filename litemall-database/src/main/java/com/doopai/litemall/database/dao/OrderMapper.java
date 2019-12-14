package com.doopai.litemall.database.dao;

import org.apache.ibatis.annotations.Param;
import com.doopai.litemall.database.domain.LitemallOrder;

import java.time.LocalDateTime;

public interface OrderMapper {
    int updateWithOptimisticLocker(@Param("lastUpdateTime") LocalDateTime lastUpdateTime, @Param("order") LitemallOrder order);
}