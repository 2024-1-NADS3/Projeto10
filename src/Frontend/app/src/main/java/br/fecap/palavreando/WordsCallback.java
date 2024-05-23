package br.fecap.palavreando;

import java.util.List;

public interface WordsCallback {
    void onSuccess(List<String> words, List<String> hints);
    void onError(Exception e);
}
