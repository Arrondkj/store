package com.mcss.store.sys.service.impl;

import com.mcss.store.sys.entity.Address;
import com.mcss.store.sys.mapper.AddressMapper;
import com.mcss.store.sys.service.IAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Arron
 * @since 2020-05-14
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
