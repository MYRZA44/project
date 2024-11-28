package com.example.contr.Repository;

import com.example.contr.model.MainModel;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mainRepo extends JpaRepository<MainModel, Long> {
}
