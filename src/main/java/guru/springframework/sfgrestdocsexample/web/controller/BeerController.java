package guru.springframework.sfgrestdocsexample.web.controller;

import guru.springframework.sfgrestdocsexample.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Donald F. Coffin on 07/10/2019 at 17:06
 */

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId")UUID beerId) {

        //TODO implement
        return new ResponseEntity<BeerDto>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody @Validated BeerDto beerDto) {

        //TODO implement
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerId(@PathVariable("beerId") UUID beerId, @RequestBody @Validated BeerDto beerDto) {

        //TODO implement
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
