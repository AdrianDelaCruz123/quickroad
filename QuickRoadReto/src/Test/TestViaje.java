package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Clases.Viaje;

class TestViaje {
	  private Viaje viaje;

	    @BeforeEach
	    public void setUp() {
	        viaje = new Viaje("1", "Madrid", "Barcelona", "2025-05-01", "2025-05-02", "No_iniciado");
	    }

	    @Test
	    public void testEsViajeFinalizado_true() {
	        viaje.setEstado("Finalizado");
	        assertTrue(viaje.esViajeFinalizado());
	    }
	    
	    
	    @Test
	    public void testEsViajeFinalizadoFalse() {
	        viaje.setEstado("En_transito");
	        assertFalse(viaje.esViajeFinalizado());
	    }

	    
	    @Test
	    public void testEsViajeEnCursoTrue() {
	        viaje.setEstado("En_transito");
	        assertTrue(viaje.esViajeEnCurso());
	    }

	    
	    @Test
	    public void testEsViajeEnCursoFalse() {
	        viaje.setEstado("Finalizado");
	        assertFalse(viaje.esViajeEnCurso());
	    }

	    @Test
	    public void testIniciarViaje() {
	        viaje.iniciarViaje();
	        assertEquals("En_transito", viaje.getEstado());
	    }

	    @Test
	    public void testFinalizarViaje() {
	        viaje.finalizarViaje();
	        assertEquals("Finalizado", viaje.getEstado());
	    }
}
