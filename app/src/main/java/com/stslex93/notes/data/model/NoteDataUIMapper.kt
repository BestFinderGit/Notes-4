package com.stslex93.notes.data.model

import com.stslex93.notes.core.Mapper
import com.stslex93.notes.core.Resource
import com.stslex93.notes.ui.model.NoteUI
import javax.inject.Inject

interface NoteDataUIMapper : Mapper.DataToUI<NoteData, Resource<NoteUI>> {

    class Base @Inject constructor() : NoteDataUIMapper {

        override fun map(data: NoteData): Resource<NoteUI> = with(data) {
            Resource.Success(
                NoteUI.Base(
                    id = id(),
                    title = title(),
                    content = content(),
                    timestamp = timestamp()
                )
            )
        }

        override fun map(exception: Exception): Resource<NoteUI> = Resource.Failure(exception)

        override fun map(): Resource<NoteUI> = Resource.Loading
    }
}