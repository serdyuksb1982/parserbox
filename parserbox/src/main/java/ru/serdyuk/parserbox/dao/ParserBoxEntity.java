package ru.serdyuk.parserbox.dao;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ParserBoxEntity {

    private String data;

    private String hash;

    private LocalDateTime lifetime;

    private boolean isPublic;
}
