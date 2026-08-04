import { configureStore } from '@reduxjs/toolkit';
import petReducer from '../features/pet/petSlice';

export const store = configureStore({
  reducer: {
    pet: petReducer,
  },
});