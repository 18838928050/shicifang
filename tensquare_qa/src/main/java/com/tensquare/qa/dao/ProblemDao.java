package com.tensquare.qa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.qa.pojo.Problem;

import java.awt.print.Pageable;

/**
 * problem数据访问接口
 * @author Administrator
 *
 */
public interface ProblemDao extends JpaRepository<Problem,String>,JpaSpecificationExecutor<Problem>{
    @Query(value="select * from tb_problem,tb_pl  where id=problemid and labelid=?",nativeQuery = true)
	public List<Problem>  newlist(String labelid, Pageable pageable);
	private List<Problem> hotlist();
	public List<Problem> waitlist();

}
