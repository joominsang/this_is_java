import React from 'react';
import { Outlet, Link } from 'react-router-dom';

const Layout = () => {
  return (
    <div style={{ maxWidth: '800px', margin: '0 auto', padding: '20px', fontFamily: 'Arial' }}>
      <header style={{ borderBottom: '2px solid #eee', marginBottom: '20px', paddingBottom: '10px' }}>
        <nav style={{ display: 'flex', gap: '20px', alignItems: 'center' }}>
          <Link to="/" style={{ fontSize: '1.5rem', fontWeight: 'bold', textDecoration: 'none', color: '#333' }}>
            🐾 Pet Manager
          </Link>
          <Link to="/">목록보기</Link>
          <Link to="/add">신규등록</Link>
        </nav>
      </header>

      <main>
        <Outlet />
      </main>

      <footer style={{ marginTop: '40px', paddingTop: '20px', borderTop: '1px solid #eee', fontSize: '0.8rem', color: '#888' }}>
        &copy; 2025 Pet CRUD Project. All rights reserved.
      </footer>
    </div>
  );
};

export default Layout;