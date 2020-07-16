package com.eletronica.deltaApi.controller;

import com.eletronica.deltaApi.bean.Aparelho;
import com.eletronica.deltaApi.bean.Cliente;
import com.eletronica.deltaApi.dao.AparelhoDAO;
import com.eletronica.deltaApi.dao.ClienteDAO;
import com.eletronica.deltaApi.dto.AparelhoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.UUID;
import java.util.Iterator;
import java.util.List;

@RestController
public class CadOsController {

    @Autowired
    private ClienteDAO clienteDAO;
    @Autowired
    private AparelhoDAO aparelhoDAO;

    @RequestMapping(value = "cadClient", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public void cadCliente() {
        Cliente c = new Cliente();
        c.setNome("Joao da Silva");
        c.setEmail("joao.silva@gmail.com");
        c.setEndereco("vasconcelos 34");
        c.setTelefone("(51)98204-0011");
        clienteDAO.save(c);
    }

    @RequestMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    private Iterator<Cliente> findAll() {
        return clienteDAO.findAll().iterator();
    }

    @RequestMapping(value = "listAparelho", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    private List<AparelhoDto> findAllAparelho() {
        List<AparelhoDto> listDTO = new ArrayList<AparelhoDto>();

        for (Aparelho a:aparelhoDAO.findAll()
             ) {
                listDTO.add(new AparelhoDto().toDTO(a));
        }
        return  listDTO;
    }

    @RequestMapping(value = "doCreate", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public List<Cliente> doCreate(@RequestBody List<Cliente> listCliente) {
        System.out.println(listCliente);
        List<Cliente> listView = new ArrayList<Cliente>();
        for (Cliente c : listCliente) {
            UUID idOne = UUID.randomUUID();
            c.setUuid(idOne.toString());
            c = clienteDAO.save(c);
            listView.add(c);
        }
        return listView;
    }
    @RequestMapping(value = "doMergeCliente", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public List<Cliente> doMergeCliente(@RequestBody List<Cliente> listCliente) {
        System.out.println("doMarge");

        List<Cliente> listView = new ArrayList<Cliente>();
        for (Cliente c : listCliente) {
            UUID idOne = UUID.randomUUID();
            c.setUuid(idOne.toString());
            c = clienteDAO.save(c);
            listView.add(c);
        }
        return listView;
    }

    @RequestMapping(value = "doCreateAparelho", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public List<AparelhoDto> doCreateAparelho(@RequestBody List<AparelhoDto> listAparelho) {
        System.out.println("doCreate");
        List<AparelhoDto> lisView = new ArrayList<AparelhoDto>();
        for (AparelhoDto a : listAparelho) {
            Aparelho a1 = aparelhoDAO.save(a.build(a));
            lisView.add(new AparelhoDto().toDTO(a1));
        }
        return lisView;
    }
    @RequestMapping(value = "doMergeAparelho", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public List<AparelhoDto> doMergeAparelho(@RequestBody List<AparelhoDto> listAparelho) {
        System.out.println("doMergeAparelho");
        List<AparelhoDto> lisView = new ArrayList<AparelhoDto>();
        for (AparelhoDto a : listAparelho) {
           Aparelho a1 = aparelhoDAO.save(a.build(a));
            lisView.add(a);
        }
        return lisView;
    }

}
