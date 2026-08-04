import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Layout from './components/Layout';
import PetListPage from './pages/PetListPage';
import PetFormPage from './pages/PetFormPage';
import PetDetailPage from './pages/PetDetailPage';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<PetListPage />} />
          <Route path="add" element={<PetFormPage />} />
          <Route path="edit/:id" element={<PetFormPage />} />
          <Route path="pet/:id" element={<PetDetailPage />} />
        </Route>
      </Routes>
    </Router>
  );
}

export default App;