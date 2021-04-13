package com.zywl.dao;

import com.zywl.model.CartModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cartDao")
public interface CartMapper {

    public void insertCart(CartModel model);

    public List<CartModel> getGoodCart(CartModel model);

    public void delete(@Param("idList") List<String> idList);

}
