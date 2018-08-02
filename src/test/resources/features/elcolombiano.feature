#Author: your.email@your.domain.com

@Regresion
Feature: Title of your feature
  I want to use this template for my feature file

  @registro
  Scenario Outline: Title of your scenario
    Given Rafa quiere leer las noticias
    When Rafa se registra en la pagina de el colombiano
    |<email>|	<confirmar_email> | <password> | <confirmar_password> | <usuario> | <nombres> | <apellidos> | <tipoDcto> | <numDcto> | <fechaCumple> | <genero> | <movil> | <fijo> | <direccion> | <pais> | <educacion> | <departamento> | <ocupacion> | <ciudad>|
    Then verifica que ingresó exitosamente viendo en pantalla
    
    Examples:
    |email|	confirmar_email | password | confirmar_password | usuario | nombres | apellidos | tipoDcto | numDcto | fechaCumple | genero | movil | fijo | direccion | pais | educacion | departamento | ocupacion | ciudad|
    ##@externaldata@./src/test/resources/Datadriven/DatadrivenElCol.xlsx@Hoja1 
   |rafaperez@gmail.com   |rafaperez@gmail.com   |carriles   |carriles   |elerreperez   |Rafael   |Pérez   |Cédula de ciudadanía   |111184356   |"9/11/1989"   |Femenino   |3005508906   |7274760   |Avenida siempre viva -123   |Albania   |Primaria   |Antioquia   |Mezclador   |Medellin|
   |rafaperezzzz@gmail.com   |rafaperezzzz@gmail.com   |carriles   |carriles   |elerreperez   |Rafael   |Pérez   |Cédula de ciudadanía   |111184357   |"9/11/1989"   |Masculino   |3005508906   |7274760   |Avenida siempre viva -123   |Albania   |Primaria   |Antioquia   |Mezclador   |Medellin|
