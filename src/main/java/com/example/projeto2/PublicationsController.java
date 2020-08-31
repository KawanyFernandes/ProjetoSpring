package com.example.projeto2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publication")
public class PublicationsController {
        @Autowired
        private PublicationRepository publicationRepository;

        @RequestMapping(value = "", method = RequestMethod.GET)
        public List<Publications> findAll(){
            return  publicationRepository.findAll();
        }
        @RequestMapping(value = "", method = RequestMethod.POST)
        public Publications save(@RequestBody Publications publications){
            return publicationRepository.save(publications);
        }

        @RequestMapping(value = "", method = RequestMethod.PUT)
        public Publications update(@RequestBody Publications publications){
            return publicationRepository.save(publications);
        }

        @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
        public void delete(@PathVariable Long id){
            publicationRepository.deleteById(id);
        }
}
