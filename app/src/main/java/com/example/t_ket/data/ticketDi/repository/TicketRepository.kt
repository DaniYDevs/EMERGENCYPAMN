package com.example.t_ket.data.ticketDi.repository

import com.example.t_ket.core.domain.model.Ticket

interface TicketRepository {
    suspend fun setIdEvent(id_event:String)
    fun getAllTickets(): MutableMap<String, Ticket>
    suspend fun getTicketById(id_ticket:String) : Ticket?
    suspend fun getTicketsFromGroup(id_group: String ) : List<Ticket>
    suspend fun getTicketByDni(dni_ticket:String) : Ticket?
    suspend fun updateStatusTicket(id_ticket: String, status:Boolean)

}
interface TicketUpdateListener {
    fun onTicketsUpdated(newTickets: Map<String, Ticket>)
}