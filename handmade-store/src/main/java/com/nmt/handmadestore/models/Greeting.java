package com.nmt.handmadestore.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class Greeting {

    private long id;
    private String content;
}
