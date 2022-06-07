package com.mytests.spring.springlombok;

import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor
@AllArgsConstructor
public class MyDataClass {

    private String name;
    private Integer id;
    private String address;
}
