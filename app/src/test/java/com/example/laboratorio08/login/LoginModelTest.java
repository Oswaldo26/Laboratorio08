package com.example.laboratorio08.login;

import static org.mockito.Mockito.verify;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginModelTest {

    @Mock
    private Login.Presenter presenter;

    private LoginModel model;

    @Before
    public void setUp() throws Exception {
        model = new LoginModel(presenter);
    }

    @Test
    public void shouldSucceedWithValidUserAndPass() throws Exception {
        model.validaUser("alberto", "androiddescero");
        verify(presenter).usuarioValido();
    }

    @Test
    public void shouldNotSucceedWithInvalidUserAndPass() throws Exception {
        model.validaUser("pepe", "androiddescero");
        verify(presenter).error();
    }
}