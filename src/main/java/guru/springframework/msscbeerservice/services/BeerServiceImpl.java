package guru.springframework.msscbeerservice.services;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import guru.springframework.msscbeerservice.web.model.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.IPA)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerDto;
        // TODO uncomment builder below when it comes time to properly implement
//        return BeerDto.builder()
//                .id(UUID.randomUUID())
//                .build();
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("Updating a beer...");
        return null;
    }

    @Override
    public BeerDto deleteBeer(UUID beerId) {
        log.debug("Deleting a beer...");
        return null;
    }

}
