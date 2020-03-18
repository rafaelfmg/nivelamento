package com.gloriadiaszup.repository

import com.gloriadiaszup.model.entities.Terminal
import org.springframework.data.jpa.repository.JpaRepository

interface TerminalRepository: JpaRepository<Terminal, Long>