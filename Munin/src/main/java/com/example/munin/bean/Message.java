package com.example.munin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Hoxton on 2022/12/12
 * @since 1.2.0
 */

@Data
@AllArgsConstructor
public class Message {
    private String key;
    private Object value;
}
