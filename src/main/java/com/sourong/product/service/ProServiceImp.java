package com.sourong.product.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sourong.product.dao.ProductVoMapper;
import com.sourong.product.domain.ProductVo;
@Service
public class ProServiceImp  implements ProductService{
	@Resource
	private ProductVoMapper proVoMapper;
	@Override
	public List<ProductVo> doselectAll() {
		List<ProductVo> pro = proVoMapper.selectAll();
		return pro;
	}

	@Override
	public int dodeleteByPrimanyKey(ProductVo proId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doinsertByProduct(ProductVo pro) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doupdateByProduct(ProductVo pro) {
		// TODO Auto-generated method stub
		return 0;
	}

}
