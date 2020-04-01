package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.MemberManager;
import com.example.demo.vo.MemberVo;

@Repository
public class MemberDao {

	public List<MemberVo> listAll() {
		return MemberManager.selectMember();
	}
}
