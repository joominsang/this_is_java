import { createSlice, createAsyncThunk } from '@reduxjs/toolkit';
import axios from 'axios';

const API_URL = 'http://localhost:8084/api/pet';

export const fetchPets = createAsyncThunk('pets/fetch', async (params) => {
  const response = await axios.get(`${API_URL}/search`, { params });
  return response.data.data;
});

export const fetchPetById = createAsyncThunk('pets/fetchOne', async (id) => {
  const response = await axios.get(`${API_URL}/${id}`);
  return response.data.data;
});

export const addPet = createAsyncThunk('pets/add', async (data) => {
  const response = await axios.post(API_URL, data);
  return response.data.data;
});

export const updatePet = createAsyncThunk('pets/update', async (data) => {
  const response = await axios.patch(API_URL, data);
  return response.data.data;
});

export const deletePet = createAsyncThunk('pets/delete', async (id) => {
  const response = await axios.delete(`${API_URL}?id=${id}`);
  return response.data.data.id;
});

const petSlice = createSlice({
  name: 'pets',
  initialState: { items: [], currentPet: null, loading: false },
  reducers: { clearCurrent: (state) => { state.currentPet = null; } },
  extraReducers: (builder) => {
    builder
      .addCase(fetchPets.fulfilled, (state, action) => { state.items = action.payload.content; })
      .addCase(fetchPetById.fulfilled, (state, action) => { state.currentPet = action.payload; })
      .addCase(deletePet.fulfilled, (state, action) => {
        state.items = state.items.filter(p => p.id !== action.payload);
      });
  }
});

export const { clearCurrent } = petSlice.actions;
export default petSlice.reducer;