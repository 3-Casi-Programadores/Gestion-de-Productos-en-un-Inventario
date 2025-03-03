# 🧠 **Lógica del Proyecto**  

## 📌 1. Descripción  
**Nombre del Proyecto:** [Nombre del Proyecto Proudctos en un invetarios]  
**Fecha:** [02/03/2025]  
**Autor:** [Nombre del Asistente de Lógica Denis Colon]  

📢 **Resumen:**  
[Este codigo normamente resumido es de hacer un inventarios de productos y los guarda correctamente y buscar los productos suceivamente.]  

# Gestión de Productos en un Inventario

## Descripción
Este programa permite administrar un inventario de productos. El sistema proporciona las siguientes funcionalidades:
- Registrar productos con su nombre y cantidad disponible.
- Actualizar el stock de un producto.
- Mostrar todos los productos disponibles.
- Filtrar y mostrar los productos con stock menor a 10 unidades.

## Herramientas necesarias
- **HashMap<String, Integer>**: Para almacenar los productos y las cantidades disponibles en el inventario.
- **Streams API y Lambda**: Para filtrar los productos con bajo stock.
- **Scanner**: Para interactuar con el usuario y registrar productos o realizar otras operaciones.

## Funcionalidades

### 1. **Registrar producto**
El programa permite registrar productos con un nombre y una cantidad disponible. Si el producto ya existe en el inventario, el sistema notificará que ya está registrado.

### 2. **Actualizar stock**
El usuario puede actualizar el stock de un producto ya registrado, ingresando un nuevo valor para la cantidad disponible. Si el producto no está en el inventario, el sistema informará que no existe.

### 3. **Mostrar productos**
Se muestran todos los productos registrados junto con su cantidad disponible en el inventario.

### 4. **Filtrar productos con stock menor a 10**
El programa filtra los productos cuyo stock es menor a 10 unidades utilizando Streams y Lambda para mostrar únicamente aquellos productos con bajo stock.

## Flujo del programa

1. **Menú interactivo**
   - El programa presenta un menú con las siguientes opciones:
     1. Registrar producto
     2. Actualizar stock
     3. Mostrar todos los productos
     4. Filtrar productos con stock menor a 10
     5. Salir
   - El usuario selecciona una opción mediante números (1-5) para realizar la acción deseada.

2. **Registrar producto**
   - El usuario introduce el nombre del producto y la cantidad disponible.
   - Si el producto ya existe, el sistema informa que el producto ya está registrado.
   - Si no existe, se agrega el producto al inventario.

3. **Actualizar stock**
   - El usuario introduce el nombre del producto que desea actualizar.
   - Si el producto existe en el inventario, el sistema pide la nueva cantidad y actualiza el stock.
   - Si el producto no está registrado, el sistema informa al usuario.

4. **Mostrar productos**
   - El sistema muestra todos los productos registrados en el inventario junto con sus cantidades.

5. **Filtrar productos con bajo stock**
   - Usando **Streams** y **Lambda**, el programa filtra y muestra los productos con stock menor a 10 unidades.

## Ejemplo de ejecución

### Menú de opciones:

*** Gestión de Inventario ***

Registrar producto
Actualizar stock
Mostrar todos los productos
Filtrar productos con stock menor a 10
Salir Selecciona una opción: 1
shell
Copiar

### Registrar un producto:
Ingresa el nombre del producto: Laptop Ingresa la cantidad disponible: 5 Producto registrado exitosamente.

shell
Copiar

### Mostrar todos los productos:
*** Gestión de Inventario ***

Registrar producto
Actualizar stock
Mostrar todos los productos
Filtrar productos con stock menor a 10
Salir Selecciona una opción: 3
Productos en el inventario: Producto: Laptop | Cantidad: 5

shell
Copiar

### Filtrar productos con bajo stock:
*** Gestión de Inventario ***

Registrar producto
Actualizar stock
Mostrar todos los productos
Filtrar productos con stock menor a 10
Salir Selecciona una opción: 4
Productos con stock menor a 10 unidades: Producto: Laptop | Cantidad: 5

markdown
Copiar

## Conclusión
Este programa permite gestionar un inventario de productos de manera eficiente utilizando Java. Utiliza **HashMap** para almacenar productos y sus cantidades, **Streams y Lambda** para filtrar los productos con stock bajo, y **Scanner** para interactuar con el usuario. Es un buen ejercicio para familiarizarse con las colecciones y las funcionalidades de Java para la manipulación de datos.




