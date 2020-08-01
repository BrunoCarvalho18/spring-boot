package com.brunocarvalho.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.brunocarvalho.bookstoremanager.dto.BookDTO;
import com.brunocarvalho.bookstoremanager.dto.MessageResponseDTO;
import com.brunocarvalho.bookstoremanager.entity.Book;
import com.brunocarvalho.bookstoremanager.mapper.BookMapper;
import com.brunocarvalho.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

	private BookRepository bookRepository;
	
	private final BookMapper bookMapper = BookMapper.INSTANCE;

	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public MessageResponseDTO create(BookDTO bookDTO) {
		Book bookToSave = bookMapper.toModel(bookDTO);
					
		Book savedBook = bookRepository.save(bookToSave);
		return MessageResponseDTO.builder()
				.message("Book created with ID " + savedBook.getId())
				.build();
	}

}
