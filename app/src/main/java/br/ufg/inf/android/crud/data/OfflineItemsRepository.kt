package br.ufg.inf.android.crud.data

import kotlinx.coroutines.flow.Flow

class OfflineItemsRepository(private val itemDao: ItemDao) : ItemsRepository {
    override fun findAllStream(): Flow<List<Item>> = itemDao.findAll()

    override fun findByIdStream(id: Int): Flow<Item> = itemDao.findById(id)

    override suspend fun insert(item: Item) = itemDao.insert(item)

    override suspend fun update(item: Item) = itemDao.update(item)

    override suspend fun delete(item: Item) = itemDao.delete(item)
}
