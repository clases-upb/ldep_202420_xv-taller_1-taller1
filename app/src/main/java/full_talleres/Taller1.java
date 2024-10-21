/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {
        try {
            System.out.println(Convertir_km_seg(40));
            System.out.println(Convertir_cm_lt(3500));
            System.out.println(Convertir_us_cops(45623));
            System.out.println(Convertir_cent_far(0));
            System.out.println(Calcular_segs((byte)1,(byte)1,(byte)1,(byte)1));
            System.out.println(Calcular_peso_carga((float)47.5, (float)7.5));
            System.out.println(Calcular_horasxviaje("Armenia", (short)285, (short)72));
            System.out.println(Calcular_combustible(638, 312, 1243, 220));
            System.out.println(Calcular_peso_luna((byte)80));
        } 
        
        catch (Exception e) {
            System.out.println("Ocurrió un error \n" + e);
        }
      

    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    
    public static String Convertir_km_seg (int km_seg){
        try {
            int mts_seg, mts_hora;
            final int Kmseg_a_mtseg = 1000;
            final int kmseg_a_mthora = 3600000;
            mts_seg = km_seg * Kmseg_a_mtseg;           
            mts_hora = km_seg * kmseg_a_mthora; 
            String result = mts_seg + " m/s - "  + mts_hora + " m/h";
            return result; 
        } 
        catch (Exception e) {
            return  "Error en la conversión";
        }        
    }
    
    
    
    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
  
    public static float Convertir_cm_lt (double cc){
        try {
            float litros;
            final double cc_a_lt = 0.001d;
            litros = (float)cc * (float)cc_a_lt;
            return litros;
        } 
        
        catch (Exception e) {
            return 0;
        }
    }

   
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */

    public static int Convertir_us_cops (int dolares){
        try {
            int pesos;
            final int TRM = 4170;
            pesos = dolares * TRM;
            return pesos;
        } 
        catch (Exception e) {
            return -1;
        }
    }
    
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */

    public static double Convertir_cent_far (int cent){
        try {
            double far;
            final byte cent_a_far = 32;
            far = cent_a_far + (9 * cent / 5);
            return far;
        } 
        catch (Exception e) {
            return 0;
        }
    }

          
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */

    public static int Calcular_segs (byte nro_dias, byte nro_horas, byte nro_min, byte nro_seg){
        try {
            int dias_seg = nro_dias * 86400;
            int horas_seg = nro_horas * 3600;
            int min_seg = nro_min * 60;
            int total_seg = dias_seg + horas_seg + min_seg + nro_seg;
            return total_seg; 
        } 
        
        catch (Exception e) {
            return -1;
        }
    }

   

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

   public static String Calcular_peso_carga (float peso_camion_total, float peso_camion_vacio){
        try {
            float peso_carga_T = peso_camion_total - peso_camion_vacio;
            float peso_carga_Kg = peso_carga_T * 1000;
            String respuesta = peso_carga_Kg + " Kilos - " + peso_carga_T + " Toneladas";
            return respuesta;
        } 
    
        catch (Exception e) {
            return "Error en la funcion Calcular_peso_carga";
        }
    }

   

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */

    public static float Calcular_horasxviaje (String destino, short kms, short km_h){
        try {
            float horas_nec = kms/km_h;
            return horas_nec;
        } 
        catch (Exception e) {
            return -1;
        }
    }

  

   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/

    public static float Calcular_combustible (int kilo1, int kilo2, int kilo3, int kilo4){
        try {
            final float comb_despegue = 1.2f;
            final float comb_aterrizaje = 0.4f;
            float cant_combus1 = (float)((kilo1 * 0.2)/60.8);
            float cant_combus2 = (float)((kilo2 * 0.2)/60.8);
            float cant_combus3 = (float)((kilo3 * 0.2)/60.8);
            float cant_combus4 = (float)((kilo4 * 0.2)/60.8);
            float total_combus = cant_combus1 + cant_combus2 + cant_combus3 + cant_combus4 + ((comb_despegue + comb_aterrizaje)*4);
            return total_combus;
        } 
    
        catch (Exception e) {
           return -1;
        }
   }

   
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */

    public static double Calcular_peso_luna (byte peso_kilos){
        try {
            final float gravedad = 9.81f;
            float peso_tierra_new;
            float peso_luna_new;
            peso_tierra_new = peso_kilos * gravedad;
            peso_luna_new = peso_tierra_new * 0.165f;
            return peso_luna_new;
        } 
        catch (Exception e) {
            return 0;
        }
    }
}

