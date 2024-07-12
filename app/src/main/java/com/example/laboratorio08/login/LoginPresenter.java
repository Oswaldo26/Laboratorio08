package com.example.laboratorio08.login;

public class LoginPresenter implements Login.Presenter {
    private Login.View view;
    private Login.Model model;


    public LoginPresenter(Login.View view) {
        this.view = view;
        model = new LoginModel(this);
    }

    @Override
    public void validaUser(String user, String pass) {
        if (view != null) {
            model.validaUser(user, pass);
        }
    }

    @Override
    public void usuarioValido() {
        if (view != null) {
            view.usuarioValido();
        }
    }

    @Override
    public void error() {
        if (view != null) {
            view.error();
        }
    }
}