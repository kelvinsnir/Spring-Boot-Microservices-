package com.kelvincb.springbootchatgpt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChatGPTRequest {

    private String model = "text-davinci-003";
    private String prompt;
    private int temperature = 1;

    @JsonProperty(Value = "max_tokens")
    private int maxtokens = 100;
}
