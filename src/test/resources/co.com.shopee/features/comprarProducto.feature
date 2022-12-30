Feature: Buscar un producto por categoria
  Yo como usuario
  Necesito buscar un producto en la pagina de https://shopee.com.co/
  Para realizar una compra de un producto

  Scenario Outline: Agregar un producto al carrito de compras
    Given Deseo buscar un producto en shopee
    When Selecciona la categoria "<categoria>", seccion "<seccion>" el producto "<producto>" y sus especificaciones "<color>" "<cantidad>"
    Then Valida que el producto sea agregado al carrito de compras
    Examples:
      | categoria     | seccion    | producto                              | color  | cantidad |
      | Celulares     | Audio      | Audífonos inalámbricos Bluetooth V6U5 | Blanco | 2        |
      | Ropa de Mujer | Pantalones | Pantalones Cargo                      | Black  | 3        |


