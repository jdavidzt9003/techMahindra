
Feature: Hacer reserva en Booking.com
  Como usuario, quiero hacer reserva de una habitación en Booking.con

  Scenario: Crear reserva de habitacion
    Given En la pagina Booking seccion alojamiento
    When Selecciona la opcion que se ajuste a su condiciones
    Then La pagina le confirma la reserva
