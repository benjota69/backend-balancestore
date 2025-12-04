package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dto.Producto;
import com.example.demo.repository.ProductoRepository;
 
import lombok.RequiredArgsConstructor;
 
// Carga algunos productos de ejemplo al iniciar la aplicación.
@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ProductoRepository productRepository;

    @Override
    public void run(String... args) {
        // Si ya hay datos, no hace nada
        if (productRepository.count() > 0) {
            return;
        }

        // Productos para tener el catálogo con datos iniciales

        Producto p1 = new Producto();
        p1.setNombre("Mouse Gamer Logitech G502 HERO");
        p1.setDescripcion("Sensor HERO 25K, 11 botones programables, RGB Lightsync");
        p1.setImagen("https://i.ibb.co/Kj5LDFTK/imagen-2025-10-08-184948785.png");
        p1.setPrecio(39990.0);
        p1.setStock(15);
        p1.setCategoria("perifericos");
        p1.setDescuento(10);
        p1.setPrecioFinal(35991.0);

        Producto p2 = new Producto();
        p2.setNombre("Teclado Mecánico Redragon Kumara K552");
        p2.setDescripcion("Switches Outemu Blue, retroiluminado RGB, diseño compacto");
        p2.setImagen("https://i.ibb.co/pjgkPrnj/imagen-2025-10-08-185422293.png");
        p2.setPrecio(34990.0);
        p2.setStock(20);
        p2.setCategoria("perifericos");
        p2.setDescuento(5);
        p2.setPrecioFinal(33241.0);

        Producto p3 = new Producto();
        p3.setNombre("Audífonos HyperX Cloud II");
        p3.setDescripcion("Sonido envolvente 7.1, micrófono desmontable, comodidad premium");
        p3.setImagen("https://i.ibb.co/rKxd8G2h/imagen-2025-10-08-185439713.png");
        p3.setPrecio(79990.0);
        p3.setStock(10);
        p3.setCategoria("audio");
        p3.setDescuento(15);
        p3.setPrecioFinal(67992.0);

        Producto p4 = new Producto();
        p4.setNombre("Silla Gamer Cougar Armor One");
        p4.setDescripcion("Ergonómica, ajustable, soporte lumbar y cervical");
        p4.setImagen("https://i.ibb.co/V00KcHLK/imagen-2025-10-08-185458735.png");
        p4.setPrecio(149990.0);
        p4.setStock(8);
        p4.setCategoria("mobiliario");
        p4.setDescuento(12);
        p4.setPrecioFinal(131991.0);

        Producto p5 = new Producto();
        p5.setNombre("Monitor Curvo Samsung Odyssey G5 27''");
        p5.setDescripcion("144Hz, 1ms, resolución QHD, panel VA curvo");
        p5.setImagen("https://i.ibb.co/fzxRbkwJ/image.png");
        p5.setPrecio(289990.0);
        p5.setStock(5);
        p5.setCategoria("pantallas");
        p5.setDescuento(20);
        p5.setPrecioFinal(231992.0);

        Producto p6 = new Producto();
        p6.setNombre("Control Xbox Series X");
        p6.setDescripcion("Control inalámbrico, Bluetooth, compatible con PC y Xbox");
        p6.setImagen("https://i.ibb.co/Lhkjk0RS/image.png");
        p6.setPrecio(69990.0);
        p6.setStock(14);
        p6.setCategoria("consolas");
        p6.setDescuento(8);
        p6.setPrecioFinal(64391.0);

        Producto p7 = new Producto();
        p7.setNombre("Mouse Pad RGB XXL");
        p7.setDescripcion("Base antideslizante, bordes iluminados con 10 modos de color");
        p7.setImagen("https://i.ibb.co/cSKY92Vq/image.png");
        p7.setPrecio(15990.0);
        p7.setStock(30);
        p7.setCategoria("accesorios");
        p7.setDescuento(0);
        p7.setPrecioFinal(15990.0);

        Producto p8 = new Producto();
        p8.setNombre("Micrófono Blue Yeti USB");
        p8.setDescripcion("Ideal para streaming y grabación, patrón cardioide y omnidireccional");
        p8.setImagen("https://i.ibb.co/7NrLjrSc/image.png");
        p8.setPrecio(99990.0);
        p8.setStock(7);
        p8.setCategoria("audio");
        p8.setDescuento(18);
        p8.setPrecioFinal(81991.0);

        Producto p9 = new Producto();
        p9.setNombre("Webcam Logitech C920");
        p9.setDescripcion("Full HD 1080p, micrófonos estéreo, excelente para streaming");
        p9.setImagen("https://i.ibb.co/jPDbGkBb/image.png");
        p9.setPrecio(69990.0);
        p9.setStock(9);
        p9.setCategoria("streaming");
        p9.setDescuento(0);
        p9.setPrecioFinal(69990.0);

        Producto p10 = new Producto();
        p10.setNombre("Luz Ring LED con trípode");
        p10.setDescripcion("Iluminación regulable para streamers y creadores de contenido");
        p10.setImagen("https://i.ibb.co/2mywgyp/image.png");
        p10.setPrecio(24990.0);
        p10.setStock(18);
        p10.setCategoria("iluminacion");
        p10.setDescuento(5);
        p10.setPrecioFinal(23741.0);

        Producto p11 = new Producto();
        p11.setNombre("GPU NVIDIA RTX 4070 Ti");
        p11.setDescripcion("12GB GDDR6X, Ray Tracing y DLSS 3.0, rendimiento extremo");
        p11.setImagen("https://i.ibb.co/ym1Hq7fN/image.png");
        p11.setPrecio(899990.0);
        p11.setStock(3);
        p11.setCategoria("hardware");
        p11.setDescuento(22);
        p11.setPrecioFinal(701992.0);

        Producto p12 = new Producto();
        p12.setNombre("CPU AMD Ryzen 7 7800X3D");
        p12.setDescripcion("8 núcleos, 16 hilos, caché 3D, rendimiento gamer superior");
        p12.setImagen("https://i.ibb.co/6J0LtrDF/image.png");
        p12.setPrecio(429990.0);
        p12.setStock(6);
        p12.setCategoria("hardware");
        p12.setDescuento(17);
        p12.setPrecioFinal(356892.0);

        Producto p13 = new Producto();
        p13.setNombre("Memoria RAM Corsair Vengeance 32GB DDR5");
        p13.setDescripcion("5600MHz, diseño RGB, bajo consumo");
        p13.setImagen("https://i.ibb.co/7tSjwxxw/image.png");
        p13.setPrecio(189990.0);
        p13.setStock(6);
        p13.setCategoria("hardware");
        p13.setDescuento(0);
        p13.setPrecioFinal(189990.0);

        Producto p14 = new Producto();
        p14.setNombre("SSD NVMe Kingston 1TB");
        p14.setDescripcion("Velocidad de lectura 3500MB/s, escritura 3000MB/s");
        p14.setImagen("https://i.ibb.co/HLcbcbVQ/image.png");
        p14.setPrecio(84990.0);
        p14.setStock(14);
        p14.setCategoria("hardware");
        p14.setDescuento(10);
        p14.setPrecioFinal(76491.0);

        Producto p15 = new Producto();
        p15.setNombre("Joystick PS5 DualSense");
        p15.setDescripcion("Retroalimentación háptica, gatillos adaptativos, batería recargable");
        p15.setImagen("https://i.ibb.co/KpfV2Wxx/image.png");
        p15.setPrecio(79990.0);
        p15.setStock(11);
        p15.setCategoria("consolas");
        p15.setDescuento(7);
        p15.setPrecioFinal(74391.0);

        Producto p16 = new Producto();
        p16.setNombre("Auriculares inalámbricos Razer Barracuda X");
        p16.setDescripcion("Bluetooth 5.2, baja latencia, micrófono desmontable");
        p16.setImagen("https://i.ibb.co/svRbGkPH/image.png");
        p16.setPrecio(99990.0);
        p16.setStock(8);
        p16.setCategoria("audio");
        p16.setDescuento(14);
        p16.setPrecioFinal(85991.0);

        Producto p17 = new Producto();
        p17.setNombre("Asus - Notebook Gamer Rog Strix G17 G713Pv-Hx165W 17.3 Fhd Amd Ryzen 9 16Gb 1Tb Ssd Rtx 4060 Gris");
        p17.setDescripcion("Notebook gamer rog strix g17 g713pv-hx165w 17.3 fhd amd ryzen 9 16gb 1tb ssd rtx 4060 gris");
        p17.setImagen("https://i5.walmartimages.cl/asr/a2f943a2-3a46-4b24-b60c-77e439f42b59.14020c68872cf6329072ee2312cf3abb.jpeg?null");
        p17.setPrecio(1159900.0);
        p17.setStock(2);
        p17.setCategoria("notebook");
        p17.setDescuento(20);
        p17.setPrecioFinal(927920.0);

        Producto p18 = new Producto();
        p18.setNombre("Macbook pro 16 pulgadas M4 PRO");
        p18.setDescripcion("El MacBook Pro de 16 pulgadas con chip M4 Pro o M4 Max ofrece un rendimiento descomunal. Está diseñado para Apple Intelligence1 y tiene una batería que dura hasta 24 horas2 y una impresionante pantalla Liquid Retina XDR con un peak de brillo de hasta 1.600 nits. Es un notebook pro en todos los sentidos.");
        p18.setImagen("https://d1aqw5mz0wngqe.cloudfront.net/images/spree/images/2474807/attachments/large/Apple_MacBook_Pro_16-inch_M4_Pro_or_Max_chip_Silver_1.jpg?1731700800");
        p18.setPrecio(1159900.0);
        p18.setStock(2);
        p18.setCategoria("notebook");
        p18.setDescuento(20);
        p18.setPrecioFinal(927920.0);

        Producto p19 = new Producto();
        p19.setNombre("iPhone 7 128GB - Negro - Reacondicionado");
        p19.setDescripcion("Pantalla retina HD de 4.7 Cámara principal 4K de 12 MP f/1.8 y frontal de 7 MP f/2.2 Memoria interna 128GB Memoria RAM 2GB Sistema operativo iOS 10 Procesador A10 Fusion Altavoces estéreo 3D Comprando un equipo Reacondicionado estás ayudando al medio ambiente a través de la economía circular.  Todos nuestros productos están testeados y cuentan con una garantía por fallas de fábrica. Touch Conectividad 4G");
        p19.setImagen("https://cl-cenco-pim-resizer.ecomm.cencosud.com/unsafe/adaptive-fit-in/1920x0/prd-cl/product-medias/bffec7c0-7841-4b7a-9f75-5b1cb176df4f/MK2PUBA00F/MK2PUBA00F-1/1719460228519-MK2PUBA00F-1-2.jpg");
        p19.setPrecio(399990.0);
        p19.setStock(1);
        p19.setCategoria("celulares");
        p19.setDescuento(62);
        p19.setPrecioFinal(149990.0);

        Producto p20 = new Producto();
        p20.setNombre("ZTE Nubia RedMagic Astra Gaming Tablet 512 GB / 16 RAM / Negro | Gsmpro");
        p20.setDescripcion("Pantalla retina HD de 4.7 Cámara principal 4K de 12 MP f/1.8 y frontal de 7 MP f/2.2 Memoria interna 128GB Memoria RAM 2GB Sistema operativo iOS 10 Procesador A10 Fusion Altavoces estéreo 3D Comprando un equipo Reacondicionado estás ayudando al medio ambiente a través de la economía circular.  Todos nuestros productos están testeados y cuentan con una garantía por fallas de fábrica. Touch Conectividad 4G");
        p20.setImagen("https://cdn.shopify.com/s/files/1/0448/8921/1040/files/redmagic-astra-gaming-tablet.webp?v=1752688096");
        p20.setPrecio(965300.0);
        p20.setStock(1);
        p20.setCategoria("celulares");
        p20.setDescuento(14);
        p20.setPrecioFinal(827400.0);

        Producto p21 = new Producto();
        p21.setNombre("Nokia 110 4G Dual SIM 128 MB negro 48 MB RAM");
        p21.setDescripcion("Pantalla retina HD de 4.7 Cámara principal 4K de 12 MP f/1.8 y frontal de 7 MP f/2.2 Memoria interna 128GB Memoria RAM 2GB Sistema operativo iOS 10 Procesador A10 Fusion Altavoces estéreo 3D Comprando un equipo Reacondicionado estás ayudando al medio ambiente a través de la economía circular.  Todos nuestros productos están testeados y cuentan con una garantía por fallas de fábrica. Touch Conectividad 4G");
        p21.setImagen("https://http2.mlstatic.com/D_Q_NP_2X_632379-MLU74111667196_012024-AB.webp");
        p21.setPrecio(78437.0);
        p21.setStock(1);
        p21.setCategoria("celulares");
        p21.setDescuento(0);
        p21.setPrecioFinal(78437.0);

        productRepository.saveAll(List.of(
                p1, p2, p3, p4, p5, p6, p7,
                p8, p9, p10, p11, p12, p13,
                p14, p15, p16, p17, p18, p19,
                p20, p21));
    }
}


