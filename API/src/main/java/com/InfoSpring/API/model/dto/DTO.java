package com.InfoSpring.API.model.dto;


import com.InfoSpring.API.model.dto.author.AuthorDto;
import com.InfoSpring.API.model.dto.book.BookDto;
import com.InfoSpring.API.model.dto.editorial.EditorialDto;
import com.InfoSpring.API.model.dto.review.ReviewDto;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AuthorDto.class, name = "authorDto"),
        @JsonSubTypes.Type(value = BookDto.class, name = "bookDto"),
        @JsonSubTypes.Type(value = EditorialDto.class, name = "editorialDto"),
        @JsonSubTypes.Type(value = ReviewDto.class, name = "reviewDto")
})
public abstract class DTO {
}
