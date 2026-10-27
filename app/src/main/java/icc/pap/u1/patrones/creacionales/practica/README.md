# Sistema de Gestión de Pedidos
## Patrones de Diseño Seleccionados

1. **Singleton (ConfiguracionSistema)**:
Lo usé ya que las indicaciones mencionan que se requiere una única instancia para evitar inconsistencias en la parte del porcentaje de impuesto que se va a aplicar a todos los pedidos.

2. **Factory Method / Fábrica(PedidoFactory)**:
Lo ocupé ya que me ayuda a encapsular una creación de objetos de tipo "Pedido" (PedidoPresencial y PedidoEnLinea) de esta manera en un caso que al pasar el tiempo se aumenten más o nuevas modalidades de pedidos, solo sería necesario aumentar clases hijas ya que ocuparán el mismo método abstracto únicamente cambiando de lo que se va a imprimir de acuerdo al modo del Pedido.