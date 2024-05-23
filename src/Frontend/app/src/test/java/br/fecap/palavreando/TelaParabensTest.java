package br.fecap.palavreando;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 32, manifest = "src/main/AndroidManifest.xml")
public class TelaParabensTest {

    private TelaParabens telaParabens;
    private Context mockContext;
    private View mockView;

    @Before
    public void setUp() {
        telaParabens = Robolectric.buildActivity(TelaParabens.class).create().get();
        mockContext = mock(Context.class);
        mockView = mock(View.class);
        // Mockando o método getApplicationContext para retornar o mockContext
        Mockito.when(mockView.getContext()).thenReturn(mockContext);
    }
    @Test
    public void testZerarJogo_deveNavegarParaMainActivity() {
        // Chamar a função zerarJogo com a view mockada
        telaParabens.zerarJogo(mockView);
        // Verificar se a Activity foi chamada com a Intent correta
        verify(mockContext).startActivity(any(Intent.class));
    }

    @Test
    public void testVerificarSeZerarJogoButtonEstaHabilitado() {
        // Verificar se o botão está habilitado
        boolean isButtonEnabled = telaParabens.verificarSebotaoVoltarEstaHabilitado();
        assertTrue(isButtonEnabled);
    }

//    @Test
//    public void testFluxoCompleto() {
//        // Inicia a Activity da tela de parabéns
//        ActivityScenario.launch(TelaParabens.class);
//
//        // Verifica se a Activity está em foco
//        Espresso.onView(ViewMatchers.withId(R.id.buttonVoltar)).perform(ViewActions.click());
//
//        // Aguarda a transição para a Activity principal
//        ActivityScenario<MainActivity> mainActivityScenario = ActivityScenario.launch(MainActivity.class);
//    }
}
