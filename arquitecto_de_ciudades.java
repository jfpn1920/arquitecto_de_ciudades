import java.util.Scanner;
public class arquitecto_de_ciudades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombresProyectos = new String[10];
        String[] arquitectos = new String[10];
        String[] tiposProyectos = new String[10];
        String[] ciudades = new String[10];
        String[] zonas = new String[10];
        String[] areas = new String[10];
        String[] presupuestos = new String[10];
        String[] anos = new String[10];
        String[] materiales = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-------------------------------------------//
        //--|menu_principal_arquitecto_de_ciudades|--//
        //-------------------------------------------//
        do {
            System.out.println("menu principal arquitecto de ciudades");
            System.out.println("1) Registrar proyecto");
            System.out.println("2) Editar proyecto");
            System.out.println("3) Listar proyectos");
            System.out.println("4) Buscar proyecto");
            System.out.println("5) Eliminar proyecto");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //------------------------//
                //--|registrar_proyecto|--//
                //------------------------//
                case 1:
                    if (total >= nombresProyectos.length) {
                        System.out.println("No hay espacio para registrar mas proyectos.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de proyecto urbano");
                    System.out.println("id del proyecto a registrar: " + id);
                    System.out.print("nombre del proyecto: ");
                    nombresProyectos[total] = entrada.nextLine();
                    System.out.print("nombre del arquitecto: ");
                    arquitectos[total] = entrada.nextLine();
                    System.out.print("tipo de proyecto: ");
                    tiposProyectos[total] = entrada.nextLine();
                    System.out.print("ciudad: ");
                    ciudades[total] = entrada.nextLine();
                    System.out.print("zona: ");
                    zonas[total] = entrada.nextLine();
                    System.out.print("area del proyecto: ");
                    areas[total] = entrada.nextLine();
                    System.out.print("presupuesto: ");
                    presupuestos[total] = entrada.nextLine();
                    System.out.print("año del proyecto: ");
                    anos[total] = entrada.nextLine();
                    System.out.print("material principal: ");
                    materiales[total] = entrada.nextLine();
                    System.out.print("estado del proyecto: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Proyecto registrado correctamente.");
                    total++;
                    break;
                //---------------------//
                //--|editar_proyecto|--//
                //---------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen proyectos registrados.");
                        break;
                    }
                    System.out.println("Datos de los proyectos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Proyecto: " + nombresProyectos[i] + " | Arquitecto: " + arquitectos[i] + " | Tipo: " + tiposProyectos[i] + " | Ciudad: " + ciudades[i] + " | Zona: " + zonas[i] + " | Area: " + areas[i] + " | Presupuesto: " + presupuestos[i] + " | Año: " + anos[i] + " | Material: " + materiales[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del proyecto: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato del proyecto");
                        System.out.print("Nuevo nombre del proyecto: ");
                        nombresProyectos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del arquitecto: ");
                        arquitectos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de proyecto: ");
                        tiposProyectos[posicion] = entrada.nextLine();
                        System.out.print("Nueva ciudad: ");
                        ciudades[posicion] = entrada.nextLine();
                        System.out.print("Nueva zona: ");
                        zonas[posicion] = entrada.nextLine();
                        System.out.print("Nueva area del proyecto: ");
                        areas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo presupuesto: ");
                        presupuestos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo año del proyecto: ");
                        anos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo material principal: ");
                        materiales[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del proyecto: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Proyecto actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|listar_proyectos|--//
                //----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen proyectos registrados.");
                    } else {
                        System.out.println("Lista de proyectos urbanos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Proyecto: " + nombresProyectos[i] + " | Arquitecto: " + arquitectos[i] + " | Tipo: " + tiposProyectos[i] + " | Ciudad: " + ciudades[i] + " | Zona: " + zonas[i] + " | Area: " + areas[i] + " | Presupuesto: " + presupuestos[i] + " | Año: " + anos[i] + " | Material: " + materiales[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //---------------------//
                //--|buscar_proyecto|--//
                //---------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen proyectos registrados.");
                        break;
                    }
                    System.out.println("busqueda de proyecto");
                    System.out.print("ingresa la id para buscar proyecto: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del proyecto encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Proyecto: " + nombresProyectos[posicion] + " | Arquitecto: " + arquitectos[posicion] + " | Tipo: " + tiposProyectos[posicion] + " | Ciudad: " + ciudades[posicion] + " | Zona: " + zonas[posicion] + " | Area: " + areas[posicion] + " | Presupuesto: " + presupuestos[posicion] + " | Año: " + anos[posicion] + " | Material: " + materiales[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|eliminar_proyecto|--//
                //-----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen proyectos registrados.");
                        break;
                    }
                    System.out.println("Datos de los proyectos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Proyecto: " + nombresProyectos[i] + " | Arquitecto: " + arquitectos[i] + " | Tipo: " + tiposProyectos[i] + " | Ciudad: " + ciudades[i] + " | Zona: " + zonas[i] + " | Area: " + areas[i] + " | Presupuesto: " + presupuestos[i] + " | Año: " + anos[i] + " | Material: " + materiales[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del proyecto a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombresProyectos[i] = nombresProyectos[i + 1];
                            arquitectos[i] = arquitectos[i + 1];
                            tiposProyectos[i] = tiposProyectos[i + 1];
                            ciudades[i] = ciudades[i + 1];
                            zonas[i] = zonas[i + 1];
                            areas[i] = areas[i + 1];
                            presupuestos[i] = presupuestos[i + 1];
                            anos[i] = anos[i + 1];
                            materiales[i] = materiales[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Proyecto eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen proyectos registrados.");
                        break;
                    }
                    int planificados = 0;
                    int enDiseno = 0;
                    int enConstruccion = 0;
                    int finalizados = 0;
                    int cancelados = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Planificado")) {
                            planificados++;
                        } else if (estados[i].equalsIgnoreCase("En diseño")) {
                            enDiseno++;
                        } else if (estados[i].equalsIgnoreCase("En construccion")) {
                            enConstruccion++;
                        } else if (estados[i].equalsIgnoreCase("Finalizado")) {
                            finalizados++;
                        } else if (estados[i].equalsIgnoreCase("Cancelado")) {
                            cancelados++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    String tipoMayor = tiposProyectos[0];
                    int cantidadTipoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadTipo = 0;
                        for (int j = 0; j < total; j++) {
                            if (tiposProyectos[i].equalsIgnoreCase(tiposProyectos[j])) {
                                cantidadTipo++;
                            }
                        }
                        if (cantidadTipo > cantidadTipoMayor) {
                            cantidadTipoMayor = cantidadTipo;
                            tipoMayor = tiposProyectos[i];
                        }
                    }
                    String arquitectoMayor = arquitectos[0];
                    int cantidadArquitectoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadArquitecto = 0;
                        for (int j = 0; j < total; j++) {
                            if (arquitectos[i].equalsIgnoreCase(arquitectos[j])) {
                                cantidadArquitecto++;
                            }
                        }
                        if (cantidadArquitecto > cantidadArquitectoMayor) {
                            cantidadArquitectoMayor = cantidadArquitecto;
                            arquitectoMayor = arquitectos[i];
                        }
                    }
                    String ciudadMayor = ciudades[0];
                    int cantidadCiudadMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadCiudad = 0;
                        for (int j = 0; j < total; j++) {
                            if (ciudades[i].equalsIgnoreCase(ciudades[j])) {
                                cantidadCiudad++;
                            }
                        }
                        if (cantidadCiudad > cantidadCiudadMayor) {
                            cantidadCiudadMayor = cantidadCiudad;
                            ciudadMayor = ciudades[i];
                        }
                    }
                    String zonaMayor = zonas[0];
                    int cantidadZonaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadZona = 0;
                        for (int j = 0; j < total; j++) {
                            if (zonas[i].equalsIgnoreCase(zonas[j])) {
                                cantidadZona++;
                            }
                        }
                        if (cantidadZona > cantidadZonaMayor) {
                            cantidadZonaMayor = cantidadZona;
                            zonaMayor = zonas[i];
                        }
                    }
                    String materialMayor = materiales[0];
                    int cantidadMaterialMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadMaterial = 0;
                        for (int j = 0; j < total; j++) {
                            if (materiales[i].equalsIgnoreCase(materiales[j])) {
                                cantidadMaterial++;
                            }
                        }
                        if (cantidadMaterial > cantidadMaterialMayor) {
                            cantidadMaterialMayor = cantidadMaterial;
                            materialMayor = materiales[i];
                        }
                    }
                    String estadoMayor = estados[0];
                    int cantidadEstadoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadEstado = 0;
                        for (int j = 0; j < total; j++) {
                            if (estados[i].equalsIgnoreCase(estados[j])) {
                                cantidadEstado++;
                            }
                        }
                        if (cantidadEstado > cantidadEstadoMayor) {
                            cantidadEstadoMayor = cantidadEstado;
                            estadoMayor = estados[i];
                        }
                    }
                    System.out.println("resumen de arquitecto de ciudades");
                    System.out.println("Proyectos registrados: " + total);
                    System.out.println("Tipo de proyecto mas frecuente: " + tipoMayor);
                    System.out.println("Arquitecto con mas proyectos: " + arquitectoMayor);
                    System.out.println("Ciudad con mas proyectos: " + ciudadMayor);
                    System.out.println("Zona con mas proyectos: " + zonaMayor);
                    System.out.println("Material mas utilizado: " + materialMayor);
                    System.out.println("Estado mas frecuente: " + estadoMayor);
                    System.out.println("Planificados: " + planificados);
                    System.out.println("En diseño: " + enDiseno);
                    System.out.println("En construccion: " + enConstruccion);
                    System.out.println("Finalizados: " + finalizados);
                    System.out.println("Cancelados: " + cancelados);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Arquitecto de Ciudades.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}