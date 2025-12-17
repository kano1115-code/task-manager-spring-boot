package com.example.taskmanager.repository;

import com.example.taskmanager.model.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoRepository extends JpaRepository<Memo, Long> {
    // 必要に応じてカスタムクエリを追加できます
}
