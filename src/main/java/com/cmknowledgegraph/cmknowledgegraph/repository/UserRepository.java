package com.cmknowledgegraph.cmknowledgegraph.repository;

import com.cmknowledgegraph.cmknowledgegraph.database.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    //根据phonenumber查找某一个人。

}
