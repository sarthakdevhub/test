package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Model.EntryBean;

@Repository
public interface APIRepo extends JpaRepository<EntryBean, String>{

}
