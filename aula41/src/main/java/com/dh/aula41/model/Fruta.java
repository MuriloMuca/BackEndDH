package com.dh.aula41.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Fruta {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
}
