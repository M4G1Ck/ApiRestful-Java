package com.residencia.ecommerce.exceptions;

    public class MethodArgumentNotValidException extends Exception{

        private static final long serialVersionUID = 1L;

        private Integer id;

        public MethodArgumentNotValidException(Integer id){
            this.id = id;
        }
        public Integer getId(){
            return id;
        }
    }
