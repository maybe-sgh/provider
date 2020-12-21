package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.GoodsModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(tags={"商品管理接口"})
@RestController
public class ProviderController {
	@GetMapping("/getMessage")
	public String getMessage() {
		return "success!";
	}
	@ApiOperation(value="获取商品信息",nickname="检查该商品是否存在")
	@PostMapping("/getGoodsMessage")
	public String getGoodsMessage(@RequestBody GoodsModel goods){
		if(goods.getGoodsname()!=null && !goods.getGoodsname().equals("")){
			return "success!";
		}else{
			return "商品名称不能为空!";
		}
	}
}
