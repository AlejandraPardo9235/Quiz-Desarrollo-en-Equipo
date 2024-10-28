# Quiz-Desarrollo-en-Equipo

Crear un JPA/ORM que lea todos los registros desde dos archivos CSV (ciudades y personas) mediante un método genérico getAll, utilizando Java Reflection para procesar ambas entidades (Ciudad y Persona). Las entidades se ubicarán en el paquete entidades, y se implementará un repositorio genérico con herencia para CiudadDAO y PersonaDAO, todos conectados al EntityManager.

1. michelle: 
- Implementación de Entidades y Configuración Genérica
- Crear las clases Ciudad y Persona en el paquete entidades con los atributos idCiudad, nombre (para Ciudad) y idPersona, nombre (para Persona).
- Desarrollar la clase genérica BaseRepository<T>, que incluye el método getAll() para leer los archivos CSV y convertir cada línea en una entidad de tipo T mediante Java Reflection.

2. andres: 
- Implementación de Repositorios Específicos (CiudadDoo y PersonaDoo)
- Crear las clases CiudadDoo y PersonaDoo, que extienden BaseRepository.
- Configurar cada repositorio para cargar sus datos específicos desde los archivos CSV.
- Asegurarse de que getAll() funcione correctamente para ambos repositorios, verificando la conversión de datos y el funcionamiento genérico.

3. nicolas: 
-Lógica de Lectura Simultánea de CSV y Pruebas
- Desarrollar el método que permite la lectura simultánea de ambos archivos CSV (ciudades.csv y personas.csv) en una única ejecución.
- Implementar pruebas unitarias para verificar que la lectura y conversión de los datos de getAll() funciona correctamente con los dos tipos de entidades (Ciudad y Persona).
- Realizar pruebas de integración para verificar la correcta ejecución conjunta de todos los módulos.
