package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.entity.PageResult;
import com.pinyougou.pojo.TbBrand;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	public List<TbBrand> findAll();
	public PageResult findPage(int pageNum, int pageSize);
	public void add(TbBrand brand);
	public TbBrand findOne(Long id);
	public void update(TbBrand brand);
	public void delete(Long[] ids);
	public PageResult findPage(TbBrand brand, int pageNum,int pageSize);
	
}
