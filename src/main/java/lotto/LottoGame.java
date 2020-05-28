package lotto;

import lotto.domain.Lotto;
import lotto.domain.LottoMachine;
import lotto.domain.Price;
import lotto.ui.InputView;

import java.util.List;

public class LottoGame {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        Price price = inputView.insertPrice();

        LottoMachine lottoMachine = new LottoMachine();
        List<Lotto> lottoList = lottoMachine.buy(price);
        inputView.answerPrice(lottoList.size());

        lottoList.forEach(inputView::printLotto);
    }
}
