package com.mcss.store.customer.mapper;

import com.mcss.store.customer.entity.Address;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
@Mapper
public interface AddressMapper extends BaseMapper<Address> {

}
