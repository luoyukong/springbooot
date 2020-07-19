package com.springboot.dao;

import com.springboot.bean.BaseBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonDao<T extends BaseBean> extends JpaRepository<T, Long> {

}
