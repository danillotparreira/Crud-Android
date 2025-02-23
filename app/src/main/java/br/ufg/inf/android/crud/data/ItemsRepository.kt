package br.ufg.inf.android.crud.data

import kotlinx.coroutines.flow.Flow

interface ItemsRepository {
    fun findAllStream(): Flow<List<Item>>
    fun findByIdStream(id: Int): Flow<Item>
    suspend fun insert(item: Item)
    suspend fun update(item: Item)
    suspend fun delete(item: Item)
}