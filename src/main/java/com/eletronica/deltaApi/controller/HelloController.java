package com.eletronica.deltaApi.controller;


import net.sf.jasperreports.engine.*;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.sql.DriverManager;
import java.util.HashMap;

@RestController
public class HelloController {

    @RequestMapping("/teste")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/geraRelatorio", method = RequestMethod.POST)
    public ResponseEntity<byte[]> getRelatorio(HttpServletResponse response, HttpServletRequest request) throws Exception {

        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/loja", "root", "123");

            HashMap parametros = new HashMap();
            System.out.println("teste id param = "+request.getParameter("id"));
            parametros.put("OS", new Integer(request.getParameter("id")));
            parametros.put("OS_ID", new Integer(request.getParameter("id")));
            parametros.put("image", System.getProperty("user.dir") + "/image/Delta-Arrow-logo.png");
            parametros.put("subReport", System.getProperty("user.dir") + "/relatorio/aparelho_subrelatorio_A4.jasper");
            parametros.put("whatsupImage", System.getProperty("user.dir") + "/image/whatsup.jpeg");
            JasperReport jasperReport = JasperCompileManager.compileReport(System.getProperty("user.dir") + "/relatorio/cliente_A4.jrxml");

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, conn);
            System.out.println("Done! filling Jasper Report ");
            JasperExportManager.exportReportToPdfFile(jasperPrint, System.getProperty("user.dir") + "/pdf/dynamic1.pdf");
            System.out.println("Done!!!exporting the pdf report");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        //forçando o retorno ser a lista só para não ficar preso no lance dos redirect e cors do navegador


        InputStream n = new FileInputStream(new File(System.getProperty("user.dir") + "/pdf/dynamic1.pdf"));
        InputStreamResource inputStreamResource = new InputStreamResource(n);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentLength(Files.size(Paths.get(System.getProperty("user.dir") + "/pdf/dynamic1.pdf")));
        headers.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity(inputStreamResource, headers, HttpStatus.OK);


        //outputStream.write(i);
        //DbxEntry.File downloadedFile = client.getFile("/" + filename, null, outputStream);
    }
}