package br.fecap.palavreando;

import android.content.Context;

import java.util.List;

public class WordsManager {

    private ApiClient apiClient;
    private List<String> wordsList;
    private List<String> hintsList; // Nova lista para armazenar as dicas

    public WordsManager(Context context) {
        apiClient = new ApiClient(context);
    }

    public void fetchWords(final WordsCallback callback) {
        apiClient.fetchWords(new WordsCallback() {
            @Override
            public void onSuccess(List<String> words, List<String> hints) {
                wordsList = words;
                hintsList = hints; // Armazena a lista de dicas
                callback.onSuccess(wordsList, hintsList); // Chama o callback com ambas as listas
            }

            @Override
            public void onError(Exception e) {
                callback.onError(e);
            }
        });
    }

    public List<String> getWordsList() {
        return wordsList;
    }

    public List<String> getHintsList() { // Método para obter a lista de dicas
        return hintsList;
    }
}
