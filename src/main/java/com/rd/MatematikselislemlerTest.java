package com.rd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatematikselislemlerTest {

    @Test
    public void testNegatifSayiIcinKarekok() {
        Exception exception = assertThrows(NegatifSayiException.class, () -> {
            Matematikselislemler.karekokHesapla(-25);
        });

        String beklenenMesaj = "Negatif sayıların karekökü alınamaz";
        assertTrue(exception.getMessage().contains(beklenenMesaj));
    }

    @Test
    public void testPozitifSayiIcinKarekok() throws NegatifSayiException {
        double sonuc = Matematikselislemler.karekokHesapla(9);
        assertEquals(3.0, sonuc, 0.001);
    }
}