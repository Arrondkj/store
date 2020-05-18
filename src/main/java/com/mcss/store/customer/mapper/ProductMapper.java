package com.mcss.store.customer.mapper;

import com.mcss.store.customer.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {


    /**
     * 查询新品推荐排行榜的前4个商品数据
     * @return
     */
    List<Product> findNewList();

}
