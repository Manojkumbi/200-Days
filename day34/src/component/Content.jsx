import { useContext } from 'react';
import { ThemeContext } from './ThemeContext';

const Content = () => {
  const { theme } = useContext(ThemeContext);

  return (
    <main style={{
      backgroundColor: theme === 'light' ? '#ffffff' : '#222',
      color: theme === 'light' ? '#000' : '#fff',
      padding: '40px',
      textAlign: 'center',
      minHeight: '80vh',
      transition: 'all 0.3s ease'
    }}>
      <h2>Welcome to the {theme === 'light' ? 'Light' : 'Dark'} Side</h2>
      <p>
        Discover a new way to experience the web! This app lets you toggle between light and dark themes effortlessly.
        Click the button above to switch the theme and see how the design adapts.
      </p>
      <p>
        Experiment with the theme that suits your mood or environment, and enjoy a seamless browsing experience.
      </p>
    </main>
  );
};

export default Content;
s