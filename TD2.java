public void deLierPlatCuisine() {
    if (this._platCuisine != null) {
        this.get_PlatCuisine().delierIngredient(this);
        this.set_PlatCuisine(null);
    }
}

public void lierPlatCuisine(PlatCuisine plat) {
    this.deLierPlatCuisine();
    plat.deLierIngredient(this);
    this.set_PlatCuisine(plat);
}

public boolean existeIngredient(Ingredient ingredient) {
    return (get_mesIngredients().contains(ingredient));
}

public boolean ajouterIngredient(Ingredient ingredient) {
    boolean ajouter;
    if (ajouter = !existeIngredient(ingredient)))
        _mesIngredient.add(ingredient);
    return ajouter; 
}

public boolean retirerIngredient(Ingredient ingredient) {
    boolean retirer;
    if (retirer = existeIngredient(ingredient))
        _mesIngredient.remove(ingredient);
    return retirer;
}

public boolean lierIngredients(Ingredient ingredient){
    boolean lier;
    if (! existeIngredient(ingredient)){
        ajouterIngredient(ingredient);
        ingredient.deLierPlatCuisine();
        ingredient.set_PlatCuisine(this);
        lier = true
    }
    else lier = false;
    return lier;
}

// Faire le contraire pour delier


public String toString1() {
    String message;
    message = "("+get_libelle()+")";
    message += "composé/e de (";
    if (! get_mesIngredient().isEmply()){
        for (int i = 0 ; i < _mesIngredient.size(); i++)
            message ;// jsp
    }
}