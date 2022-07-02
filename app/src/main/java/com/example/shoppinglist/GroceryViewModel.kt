package com.example.shoppinglist

import androidx.lifecycle.ViewModel

class GroceryViewModel(private val repository: GroceryRepository) : ViewModel() {

    fun insert(items: GroceryItems) = GlobalScope.launch{
        repository.insert(items)
    }

    fun delete(items: GroceryItems) = GlobalScope.launch{
        repository.delete(items)
    }

    fun getAllGroceryItems() = repository.getAllItems()

}