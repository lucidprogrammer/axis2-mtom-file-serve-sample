# Axis2 MTOMFileServe Sample

This image builds with MTOM enabled (refer to [axis2.xml](axis2.xml)).

You can run using the following command.
```

docker run --name axis2 --rm -it --net=host  lucidprogrammer/axis2

// you should be able to go to localhost:8080
// you should see MTOMFileServe and Version as the listed available services.
// Use anything like SoapUI/Wizdler to access the WSDL link and invoke post.
// the parameter does not matter, it will just serve you the axis2 logo. axis.jpg
// you can modify the code for your specific mtom file servicing application.
// review Dockerfile, you can use it with tomcat too.

```
