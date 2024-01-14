# Challenge

## Pasos para ejecutar
mvn clean install
mvn spring-boot:run


#Ejemplos.

Podemos ver en los ejemplos scoress superior a 0.7, es la condicion para que la ciudad sea agregada.

## Ejemplo 1:
Peticion:
http://localhost:8080/suggestions?q=London

Respuesta:
{
  "suggestions": [
    {
      "name": "Lyndon, VT, US",
      "latitude": 44.51422119140625,
      "longitude": -72.01093292236328,
      "score": 0.8333333
    },
    {
      "name": "London, 08, CA",
      "latitude": 42.98339080810547,
      "longitude": -81.23303985595703,
      "score": 1.0
    },
    {
      "name": "Lindon, UT, US",
      "latitude": 40.34328842163086,
      "longitude": -111.72075653076172,
      "score": 0.8333333
    },
    {
      "name": "London, OH, US",
      "latitude": 39.886451721191406,
      "longitude": -83.44824981689453,
      "score": 1.0
    },
    {
      "name": "Lyndon, KY, US",
      "latitude": 38.25674057006836,
      "longitude": -85.60163116455078,
      "score": 0.8333333
    },
    {
      "name": "London, KY, US",
      "latitude": 37.12897872924805,
      "longitude": -84.08325958251953,
      "score": 1.0
    },
    {
      "name": "Loudon, TN, US",
      "latitude": 35.73284912109375,
      "longitude": -84.33380889892578,
      "score": 0.8333333
    }
  ]
}



## Ejemplo 2:
Peticion:
http://localhost:8080/suggestions?q=London

Respuesta:


{
  "suggestions": [
    {
      "name": "Delta, 02, CA",
      "latitude": 49.14398956298828,
      "longitude": -122.90679931640625,
      "score": 1.0
    },
    {
      "name": "Delta, CO, US",
      "latitude": 38.742210388183594,
      "longitude": -108.06896209716797,
      "score": 1.0
    },
    {
      "name": "Deltona, FL, US",
      "latitude": 28.90053939819336,
      "longitude": -81.263671875,
      "score": 0.71428573
    }
  ]
}

## Ejemplo 3:
http://localhost:8080/suggestions?q=Lakeside

Respuesta:

{
  "suggestions": [
    {
      "name": "Lakeside, VA, US",
      "latitude": 37.60765075683594,
      "longitude": -77.4769287109375,
      "score": 1.0
    },
    {
      "name": "Lakeside, CA, US",
      "latitude": 32.857269287109375,
      "longitude": -116.92224884033203,
      "score": 1.0
    },
    {
      "name": "Lakeside, FL, US",
      "latitude": 30.129959106445312,
      "longitude": -81.76815032958984,
      "score": 1.0
    }
  ]
}




