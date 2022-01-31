import numpy as np

def sigmoid(z):
    """
    Return:
    s -- sigmoid(z)
    """
    
    
    s = 1./(1+np.exp(-z))
    
    return s

def RELU(z):
    """
    Return:
    s -- RELU(z)
    """
    s = np.maximum(z,0)
    return s
def Parametric_RELU(z, a):
    """
    z -- vector
    a -- parameter int
    Return:
    s -- Parametric_RELU(z)
    """
    s = np.maximum(z, z*a )
    return s

def Leaky_RELU(z):
    """
    Return:
    s -- RELU(z)
    """
    # s = np.where( z>0 , z, 0.01*z)
    s = np.maximum(z, z*0.01 )
    return s

def Tanh(z):
    """
    Return:
    s -- tanh(z)
    """
    s = (np.exp(z) - np.exp(-z))/(np.exp(z) + np.exp(-z))

    return s

def Silu(z):
    """
    Return:
    s -- sigmoid(z)*z
    """
    s = z*sigmoid(z)

    return s


