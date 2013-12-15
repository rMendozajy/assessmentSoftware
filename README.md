assessmentSoftware
=============================

This project seeks to automate the certification process of educational and cultural software. You can find more information about the DIGETE (Dirección General de Tecnologías Educativas) process in the following link: https://dl.dropboxusercontent.com/u/69163795/PCSE-DF01-DIGETE-2010/Proceso/DF01_CSE_2010.pdf)


Technology Involved
=============================

1) J2EE

2) DAO Pattern

3) Css | I18N

4) Jdbc

5) Apache Tomcat v6.0

6) Struts

7) Ayax

8) IDE Eclipse Ganymede

Brief presentation
=============================

You can see all system requirements here:

*) https://dl.dropboxusercontent.com/u/69163795/PCSE-DF01-DIGETE-2010/Proceso/DF01_CSE_2010.pdf

*) https://dl.dropboxusercontent.com/u/69163795/PCSE-DF01-DIGETE-2010/Resoluci%C3%B3n%20Directorial%20Eval.%20de%20SW/RD_EVALUACION_SOFTWARE.pdf

Then, also show you the general use case diagram and database physical model:

*) https://dl.dropboxusercontent.com/u/69163795/PCSE-DF01-DIGETE-2010/Caso%20de%20Uso%20General/usecasedigeteprocess.png

*) https://dl.dropboxusercontent.com/u/69163795/PCSE-DF01-DIGETE-2010/Modelo%20F%C3%ADsico/databasephysicalmodel.png


Data dictionary
=============================


Aspecto

IdAspecto.- Representa el código del aspecto

NombreAspecto.- Representa el nombre del aspecto



1) Item

IdItem.- Representa el código del ítem

NombreItem.- Representa el nombre del ítem

Aspecto_idAspecto.- Representa el código del aspecto a que pertenece el ítem

2) Puntaje

idPuntaje.- Representa el código del puntaje

TipoPuntaje.- Representa el tipo de puntaje

Puntaje.- Representa el valor del puntaje de acuerdo al tipo de puntaje

Item_idItem.- Representa el código del ítem al que pertenece el puntaje

3) Pregunta

idPregunta.- Representa el código de la pregunta

NombrePre.- Representa el nombre de la pregunta, es decir, la descripción del idPuntaje

Item_idItem.- Representa el código del ítem al que pertenece la pregunta

4) Pregunta_has_Evaluacion

Esta tabla es resultado de la relación de muchos a muchos de la tabla 'Pregunta' con 'Evaluacion'

Pregunta_idPregunta.-  Representa el código de la pregunta 

Evaluacion_idEvaluacion.- Representa el código de la Evaluacion

Puntaje_idPuntaje.- Representa el código del puntaje

5) Evaluacion

idEvaluacion.- Representa el código de la evaluación

NotaDeEvaluacion.- Representa el valor de la nota de la evaluación que se irá actualizando con un trigger.

FechaRegEvaluacion.- Representa la fecha en la cual se registro la evaluación

6) Departamento

idDepartamento.- Representa el código del departamento

NombreDepartamento.- Representa el nombre del departamento

7) Provincia 

idProvincia.- Representa el código de la provincia

NombreProvincia.- Representa el nombre de la provincia

Departamento_idDepartamento.- Representa el código del departamento al que pertenece dicha provincia.

8) Usuario

C_Usuario.- Representa el código del usuario

N_UsuarioPassword.- Representa el password del usuario

N_TipoUsuario.- Representa el tipo de usuario

N_NombreUsuario.- Representa el nombre del usuario

N_ApePaternoUsuario.- Representa el apellido paterno del usuario

N_ApeMaternoUsuario.- Representa el apellido materno del usuario

Provincia_idProvincia.- Representa el código de la provincia al que el usuario pertenece

FechaRegUsuario.- Representa la fecha del registro del usuario

9) Software

idSoftware.- Representa el código del software

Evaluacion_idEvaluacion.- Representa el código de la evaluación del software

Especialista_C_Usuario.- Representa el código del especialista designado

Nombre_Software.- Representa el nombre del  software

DescripcionSoftware.- Representa la descripción del software

Tema.- Representa el tipo de programa

TipoSoftware.- Representa el tipo de software, es decir, si es tutorial, aplicación, etc.

Nivel.- Representa el grado de instrucción, es decir, si para primaria o secundaria.

Grado.- Representa el grado del nivel del software que se va a registrar.

EstadoSoftware.- Representa el estado en el que se encuentra el software, es decir, si se encuentra en estado recibido, 
pendiente, revisado si ya se le evaluó, entre otros.

FechaRegSoftware.- Representa la fecha en la cual fue registrado el software

10) Software_has_Usuario

Software_idSoftware.- Representa el código del software

Docente_C_Usuario.- Representa el código del docente al que pertenece el software


Contributing
=============================
Pull requests are welcome.



