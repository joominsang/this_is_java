import { createSlice, createAsyncThunk } from '@reduxjs/toolkit';
import { petApi } from '../../api/petApi';

// Thunks
export const getPets = createAsyncThunk('pet/getList', async (params) => {
  const response = await petApi.fetchList(params);
  return response.data.data; // 서버 응답 구조: { data: { content: [...] } }
});

export const addPet = createAsyncThunk('pet/add', async (data) => {
  const response = await petApi.create(data);
  return response.data.data;
});

export const removePet = createAsyncThunk('pet/remove', async (id) => {
  await petApi.delete(id);
  return id;
});

const petSlice = createSlice({
  name: 'pet',
  initialState: {
    list: [],
    pagination: {},
    loading: false,
    currentPet: null
  },
  extraReducers: (builder) => {
    builder
      .addCase(getPets.fulfilled, (state, action) => {
        state.list = action.payload.content;
        state.pagination = action.payload;
      })
      .addCase(removePet.fulfilled, (state, action) => {
        state.list = state.list.filter(pet => pet.id !== action.payload);
      });
  }
});

export default petSlice.reducer;