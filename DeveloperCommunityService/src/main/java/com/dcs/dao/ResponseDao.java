package com.dcs.dao;

import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.dcs.entity.Developer;

import com.dcs.entity.Post;

import com.dcs.entity.Response;

@Repository

public interface ResponseDao extends JpaRepository<Response, Integer> {

}