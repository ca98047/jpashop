package com.jinow.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book extends Item {
    private String author;
    private String isbn;
}
