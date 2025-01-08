package com.dcac.lunchtray.ui.components

import androidx.annotation.StringRes
import com.dcac.lunchtray.R

enum class LunchTrayScreenEnum(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Entree(title = R.string.choose_entree),
    Accompaniment(title = R.string.choose_accompaniment),
    SideDishes(title= R.string.choose_side_dish),
    OrderCheckout(title = R.string.order_checkout)
}