package com.example.sweatermvc.repos;

import com.example.sweatermvc.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message,Long> {
}
