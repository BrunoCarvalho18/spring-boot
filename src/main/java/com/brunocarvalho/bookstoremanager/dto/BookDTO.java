package com.brunocarvalho.bookstoremanager.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
	
	public Long id;
	
	@NotBlank
	@Size(max = 200)
	public String name;
	
	@NotNull
	private Integer pages;
	
	@NotNull
	private Integer chapters;
	
	@NotBlank
	@Size(max=100)
	private String isbn;
	
	@NotBlank
	@Size(max=200)
	@Pattern(regexp ="(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$",
    message = "ISBN format must be a valid format")
	private String publisherName;
	
	@Valid
	@NotNull
	private AuthorDTO author;

}
