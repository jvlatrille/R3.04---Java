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