package com.huocompany.jpatest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huocompany.jpatest.dto.MemberDto;

public interface MemberRepository extends JpaRepository<MemberDto, Long> {

	String save = null;
	//<엔티티클래스의 타입, 기본키의 타입>


	

}
