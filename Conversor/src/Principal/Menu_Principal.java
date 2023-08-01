package Principal;

import javax.swing.JOptionPane;
import Funciones.*;

public class Menu_Principal {

	public static void main(String[] args) {
		boolean continuar;
		ConvertirDolaresFN moneda = new ConvertirDolaresFN();
		ConversorTemperaturaFN temperatura = new ConversorTemperaturaFN();
		ConversorMasaFN masa = new ConversorMasaFN();

		Object[] opciones = { "Conversor de moneda", "Conversor de temperatura", "Conversor de masa" };

		do {
			Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opcion:", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, opciones, "Seleccion");

			if (seleccion == null) {
				JOptionPane.showMessageDialog(null, "Saliendo del programa...");
				return;
			}
			String opcionSeleccionada = seleccion.toString();
			switch (opcionSeleccionada) {
			case "Conversor de moneda":
				String  dinero = obtenerValor("Ingrese el dinero a convertir: ");
				
				if (dinero != null && esNumeroValido(dinero, true)) {
					double monto = Double.parseDouble(dinero);
					moneda.ConvertirMoneda(monto);
				} 
				break;

			case "Conversor de temperatura":
				String temp = obtenerValor("Ingrese temperatura a convertir: ");
				
				if (temp != null && esNumeroValido(temp, false)) {
					double monto = Double.parseDouble(temp);
					temperatura.ConvertirTemperatura(monto);
				}
				break;

			case "Conversor de masa":
				String cantidad = obtenerValor("Ingrese la masa  convertir: ");
				
				if (cantidad != null && esNumeroValido(cantidad, true)) {
					Double monto = Double.parseDouble(cantidad);
					masa.ConvertirMasa(monto);
				}
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opcion no válida, saliendo del programa.");
				break;
			}
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar haciendo conversiones?", "Continuar",
					JOptionPane.YES_NO_OPTION);
			continuar = (respuesta == JOptionPane.YES_OPTION);

		} while (continuar);

		JOptionPane.showMessageDialog(null, "Gracias por usar nuestro conversor. :)");
	}

	public static String obtenerValor(String mensaje) {
        String valor = JOptionPane.showInputDialog(mensaje);
        if (valor == null) {
            JOptionPane.showMessageDialog(null, "Saliendo del programa...");
            return null;
        }
        return valor.trim(); //.trim() elimina los espacios que el usuario pueda ingresar tanto antes o despues.
    }
	
	public static boolean esNumeroValido(String valor, boolean mayorACero) {
	    try {
	        double cant = Double.parseDouble(valor);
	        if (mayorACero) {
	            if (cant > 0) {
	                return true;
	            } else {
	                JOptionPane.showMessageDialog(null, "Valor inválido. Ingrese solo valores numéricos positivos.");
	                return false;
	            }
	        } else {
	            if (cant >= 0 || cant < 0) {
	                return true;
	            } else {
	                JOptionPane.showMessageDialog(null, "Valor inválido. Ingrese solo valores numéricos.");
	                return false;
	            }
	        }
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Valor inválido. Ingrese solo valores numéricos.");
	        return false;
	    }
	}

}
