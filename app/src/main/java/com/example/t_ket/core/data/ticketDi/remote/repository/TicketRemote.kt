package com.example.t_ket.core.data.ticketDi.remote.repository

import com.example.t_ket.core.domain.model.Ticket

interface TicketRemote {
    suspend fun updateStatusTicket(id_ticket: String, status: Boolean)
    suspend fun getValidatedTickets(): List<Ticket>
    suspend fun getNotValidatedTickets(): List<Ticket>
    suspend fun getNumberOfValidatedTickets() : Int
    suspend fun getNumberOfNotValidatedTickets() : Int
}