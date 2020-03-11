package com.gloriadiaszup.api

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class VehicleRequest(
        @get: NotNull
        @get: NotEmpty
        var plate: String?,
        @get: NotNull
        @get: NotEmpty
        var renavam: String?,
        @get: NotNull
        var idDriver: Long?
)