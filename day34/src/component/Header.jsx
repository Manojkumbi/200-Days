import { useContext } from 'react';
import { ThemeContext } from './ThemeContext';

const Header = () => {
  const { theme, toggleTheme } = useContext(ThemeContext);

  return (
    <header style={{
      backgroundColor: theme === 'light' ? '#f0f0f0' : '#333',
      color: theme === 'light' ? '#333' : '#f0f0f0',
      padding: '20px',
      textAlign: 'center',
      boxShadow: theme === 'light' ? '0px 4px 12px rgba(0, 0, 0, 0.1)' : '0px 4px 12px rgba(255, 255, 255, 0.1)',
      transition: 'all 0.3s ease'
    }}>
      <h1>Theme Switcher App</h1>
      <button 
        onClick={toggleTheme} 
        style={{
          padding: '10px 20px',
          backgroundColor: theme === 'light' ? '#333' : '#f0f0f0',
          color: theme === 'light' ? '#f0f0f0' : '#333',
          border: 'none',
          borderRadius: '5px',
          cursor: 'pointer',
          transition: 'all 0.3s ease'
        }}>
        Switch to {theme === 'light' ? 'Dark' : 'Light'} Theme
      </button>
    </header>
  );
};

export default Header;
