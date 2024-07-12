package com.example.laboratorio08.login;

public interface Login {
    interface View {
        void usuarioValido();
        void error();
        String getUserName();
        String getPassword();
    }

    interface Presenter {
        void validaUser(String user, String pass);
        void usuarioValido();
        void error();
    }

    interface Model {
        void validaUser(String user, String pass);
    }
}