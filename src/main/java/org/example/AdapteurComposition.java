package org.example;

public class AdapteurComposition implements Standard {
    private ImplAdapter adapter = new ImplAdapter();
    @Override
    public void operation(int nb1, int nb2) {
        int nb=adapter.operation2(nb1, nb2);
        adapter.operation3(nb);
    }
}
