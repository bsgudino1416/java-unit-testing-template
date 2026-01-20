public class Propina {

  /**
   * Calcula el total a pagar incluyendo propina.
   *
   * Reglas:
   *  - subtotal >= 0
   *  - porcentajePropina entre 0 y 100 (inclusive)
   *  - total = subtotal + subtotal * (porcentajePropina / 100)
   *  - si una regla no se cumple: lanzar IllegalArgumentException
   */
  public static double totalConPropina(double subtotal, double porcentajePropina) {

    // Regla (a): subtotal no puede ser negativo
    if (subtotal < 0) {
      throw new IllegalArgumentException("El subtotal no puede ser negativo");
    }

    // Regla (b): porcentaje entre 0 y 100
    if (porcentajePropina < 0 || porcentajePropina > 100) {
      throw new IllegalArgumentException("El porcentaje de propina debe estar entre 0 y 100");
    }

    // Regla (c): cálculo del total
    return subtotal + subtotal * (porcentajePropina / 100.0);
  }
}

