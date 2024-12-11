package com.example.roomcronoapp.repository

import com.example.roomcronoapp.model.Cronos
import com.example.roomcronoapp.room.CronosDatabaseDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class CronosRepository @Inject constructor(private val cronosDatabaseDao: CronosDatabaseDao){
    suspend fun addCronos(crono: Cronos) = cronosDatabaseDao.insert(crono)
    suspend fun updateCronos(crono: Cronos) = cronosDatabaseDao.update(crono);
    suspend fun deleteCronos(crono: Cronos) = cronosDatabaseDao.delete(crono)
    fun getAllCronos(): Flow<List<Cronos>> = cronosDatabaseDao.getCronos().flowOn(Dispatchers.IO).conflate()
    fun getAllCronosById(id:Long): Flow<Cronos> = cronosDatabaseDao.getCronosById(id).flowOn(Dispatchers.IO).conflate()
}