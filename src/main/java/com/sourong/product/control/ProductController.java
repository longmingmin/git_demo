package com.sourong.product.control;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sourong.product.domain.ProductVo;
import com.sourong.product.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private IProductService productService;
	
	@RequestMapping("/con")
	public String conSelectAll(HttpServletRequest request,HttpServletResponse response) {
		List<ProductVo> productVo = productService.doselectAll();
		request.setAttribute("productVo", productVo);
		return "product-list";
	}
}
