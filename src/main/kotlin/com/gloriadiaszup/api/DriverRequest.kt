package com.gloriadiaszup.api

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class DriverRequest (

    @get: NotNull
    @get: NotEmpty
    val name: String,
    @get: NotNull
    @get: NotEmpty
    val cnhNumber: String,
    @get: NotNull
    @NotEmpty
    val dateOfBirth: String
)