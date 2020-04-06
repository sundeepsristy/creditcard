package app.rest.handler;

        import io.swagger.annotations.ApiResponse;
        import io.swagger.annotations.ApiResponses;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.apache.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;
        import app.persistence.entity.Cards;
        import app.persistence.repository.CardRepository;
        import app.rest.model.AddCardInfoRequest;
        import app.rest.model.CardDetailsResponse;

        import javax.validation.Valid;
        import java.math.BigDecimal;
        import java.math.RoundingMode;
        import java.util.List;
        import java.util.stream.Collectors;

@RestController
public class CardRequestHandler {
    private static final String CLASSNAME = CardRequestHandler.class.getName();
    private static final Logger LOG = LoggerFactory.getLogger(CLASSNAME);
    @Autowired
    private CardRepository cardRepository;

    @PostMapping
    @RequestMapping("/api/card/Add")
    @ApiResponses(value = {
            @ApiResponse(code =HttpStatus.SC_UNPROCESSABLE_ENTITY,message ="When  validation of request parameters fail"),
            @ApiResponse(code=HttpStatus.SC_INTERNAL_SERVER_ERROR,message = "When data is unable to persist in the db")
    })
    public ResponseEntity<HttpStatus>  addCreditCard(@RequestBody final @Valid  AddCardInfoRequest addCardInfoRequest){
        LOG.trace("Entry");
        Cards cards = new Cards();
        cards.setName(addCardInfoRequest.getName());
        cards.setCardNumber(addCardInfoRequest.getCardNumber());
        cards.setCreditLimit(addCardInfoRequest.getLimit());
        cards.setBalance(BigDecimal.valueOf(addCardInfoRequest.getLimit()).setScale(2, RoundingMode.HALF_EVEN)  );
        cardRepository.save(cards);
        LOG.trace("Exit");
        return new ResponseEntity(org.springframework.http.HttpStatus.CREATED);

    }


    /**
     * Gets All the existing cards
      * @return  List<CardDetailsResponse> List of CardDetails Response
     */
    @GetMapping
    @RequestMapping("/api/card/GetAll")
    @ApiResponse(code = HttpStatus.SC_INTERNAL_SERVER_ERROR,message = "When Exception occured while fetch details from db and" +
            " converting to response")
    public List<CardDetailsResponse> getAll() {
        LOG.trace("Entry");
        List<Cards> cardsInfoList = cardRepository.findAll();
        List<CardDetailsResponse> cardDetailsResponseList = cardsInfoList.stream().map(card -> {
            CardDetailsResponse cardDetailsResponse = new CardDetailsResponse();
            cardDetailsResponse.setName(card.getName());
            cardDetailsResponse.setCardNumber(card.getCardNumber());
            cardDetailsResponse.setBalance(card.getCurrencySymbol()+card.getBalance().toPlainString());
            cardDetailsResponse.setLimit(card.getCurrencySymbol()+String.valueOf(card.getCreditLimit()));
            return cardDetailsResponse;
        }).collect(Collectors.toList());
        LOG.trace("Exit");
        return cardDetailsResponseList;
    }

}
