# 📘 Documentación del Proyecto

## 📌 1. Descripción  
**Nombre del Proyecto:** Gestión de Inventario  
**Fecha de Creación:** 03/03/2025
**Autor(es):** Uziel Garcia
**Versión:** 1.0  

📢 **Resumen:**  
Este programa permite gestionar un inventario de productos. Los usuarios pueden registrar nuevos productos, actualizar el stock de productos existentes, ver todos los productos en el inventario y filtrar los productos con un stock menor a 10 unidades. El programa está diseñado para ser interactivo mediante un menú, donde el usuario puede seleccionar distintas opciones para realizar acciones sobre el inventario. Se recomienda seguir una lógica modular y fácil de entender, dividiendo cada acción en métodos separados para facilitar su mantenimiento y comprensión.

---

## 🛠 2. Requisitos  
📌 **Lenguaje de programación:** Java  
📌 **Versión de Java recomendada:** Java 17  
📌 **Dependencias necesarias:**  
- No se requieren dependencias externas.  

📌 **Herramientas recomendadas:**  
- IDE sugerido: [VS Code]  
- Compilador: `javac`  

---

## 📄 3. Funcionalidades

El programa permite las siguientes funcionalidades:

1. **Registrar Producto:** Permite al usuario ingresar un nuevo producto al inventario, con su nombre y cantidad disponible. Si el producto ya existe, muestra un mensaje indicándolo.
   
2. **Actualizar Stock:** Permite al usuario actualizar la cantidad disponible de un producto en el inventario.
   
3. **Mostrar Productos:** Muestra todos los productos y sus cantidades en el inventario.

4. **Filtrar Productos con Stock Bajo:** Muestra todos los productos cuyo stock es menor a 10 unidades.

---

## 🧑‍💻 4. Lógica de Implementación

1. **Registro de Producto:**  
   - El programa utiliza un `HashMap` donde la clave es el nombre del producto y el valor es la cantidad disponible.  
   - Se verifica si el producto ya existe en el inventario, y si es así, se informa al usuario. Si no, se agrega el producto al inventario.

2. **Actualización de Stock:**  
   - Se solicita el nombre del producto y, si existe, se permite al usuario ingresar una nueva cantidad, la cual reemplaza la anterior.

3. **Mostrar Productos:**  
   - Si el inventario no está vacío, se muestra la lista de todos los productos y sus cantidades.

4. **Filtrar Productos con Stock Bajo:**  
   - Utiliza `Streams` de Java para filtrar y mostrar los productos con un stock inferior a 10 unidades. Esto se logra utilizando una expresión lambda que verifica si el valor del stock es menor a 10.

---

## ⚙️ 5. Estructura de Datos

### **HashMap**  
El inventario se maneja mediante un `HashMap<String, Integer>`, donde:
- **Clave (String):** Nombre del producto.
- **Valor (Integer):** Cantidad disponible del producto.

---



