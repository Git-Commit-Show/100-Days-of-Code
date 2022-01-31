import numpy as np
import matplotlib.pyplot as plt
import h5py
import scipy
from PIL import Image
from scipy import ndimage

def sigmoid(z):
    """
    Return:
    s -- sigmoid(z)
    """
    
    s = 1./(1+np.exp(-z))
    return s
def initialize_with_zeros(dim):
    """
    Esta funcion crea un vector de ceros de dimension (dim, 1) para w e inicializa b en 0.
    
    Argument:
    dim -- el tamaño del vector w (o numero de parametros en nuestro caso, recuerden que w <w1,w2,w3>)
    
    Returns:
    w -- un 0-vector de la forma (dim, 1)
    b -- un escalar (correspondiente al termino de sesgo)
    """
    
    w = np.zeros((dim,1))
    b = 0

    assert(w.shape == (dim, 1))
    assert(isinstance(b, float) or isinstance(b, int))
    
    return w, b

def propagate(w, b, X, Y):
    """
    Implementa la funcion de costo y sus gradientes para la propagacion explicada arriba

    Arguments:
    w -- pesos de los parametros, un arreglo numpy de la forma (num_px * num_px * 3, 1)
    b -- bias, un scalar
    X -- conjunto de datos (num_px * num_px * 3, numero de ejemplos)
    Y -- vector de etiquetas (conteniendo 0 si non-cat, 1 si cat) de la forma (1, numero de ejemplos)

    Return:
    cost -- el opuesto de la probabilidad log para la regresion logisitca
    dw -- gradiente de la perdida con respecto a w, por tanto tine la misma shape de w
    db -- gradiente de la perdida con respecto a b, por tanto tine la misma shape de b
    
    Tips:
    - np.log() calcula logaritmo de escalar o arreglo numpy, np.dot() calcula el producto matricial de dos arreglos numpy
    """
    
    m = X.shape[1]
    
    # FORWARD PROPAGATION (FROM X TO COST)
    A = sigmoid(np.dot(w.T,X) +b)                                   # compute activation
    #cost = -(np.dot(Y, np.log(A.T)) + np.dot(1. - Y, np.log(1. - A.T)))/m
    cost = 0
    for i in range(m):
        cost = cost+ (Y[0][i])*np.log(A[0][i]) + (1. - Y[0][i])*np.log(1. - A[0][i])

    cost = -(cost)/m
    # compute cost
    
    
    # BACKWARD PROPAGATION (TO FIND GRAD)

    db = A - Y
    dw = (np.dot(X,db.T))/m
    db = np.sum(db)/m

    assert(dw.shape == w.shape)
    assert(db.dtype == float)
    cost = np.squeeze(cost)
    assert(cost.shape == ())
    
    grads = {"dw": dw,
             "db": db}
    
    return grads, cost

def optimize(w, b, X, Y, num_iterations, learning_rate, print_cost = False):
    """
    
    
    Esta función optimiza w y b ejecutando un algoritmo de descenso de gradiente
    
    Arguments:
    w -- pesos, un array numpy de tamaño (num_px * num_px * 3, 1)
    b -- bias, un escalar
    X -- datos de forma (num_px * num_px * 3, número de ejemplos)
    Y -- vector de etiquetas (que contiene 0 si no es gato, 1 si es gato), de forma (número de ejemplos, 1)
    num_iterations -- número de iteraciones del bucle de optimización
    learning_rate -- tasa de aprendizaje de la regla de actualización del descenso de gradiente
    print_cost -- bool que en Verdadero permite imprimir la pérdida cada 100 iteraciones del algoritmo del descenso del graiente
    
    Return:
    params -- diccionario que contiene los pesos w y el sesgo b
    grads -- diccionario que contiene los gradientes de los pesos y el bias con respecto a la función de coste
    costs -- lista de todos los costes calculados durante la optimización, que se utilizará para trazar la curva de aprendizaje.
    
    Consejos:
    Básicamente necesitas escribir dos pasos e iterar a través de ellos:
        1) Calcular el coste y el gradiente para los parámetros actuales. Use propagate().
        2) Actualizar los parámetros utilizando la regla de descenso de gradiente para w y b.
    """
    
    costs = []
    
    for i in range(num_iterations):
        
        
        # Calculo del Costo y el gradiente
        grads, cost = propagate(w,b,X,Y)
        ### FIN DEL CODIGO ###
        
        # Obten las derivadas de grads
        dw = grads["dw"]
        db = grads["db"]
        
        # Regla de actualizacion del descenso del gradiente
        w = w - dw*learning_rate
        b = b - db*learning_rate
        
        
        # guarda los costos
        if i % 100 == 0:
            costs.append(cost)
        
        # Imprimir el costo cada 100 iteraciones
        if print_cost and i % 100 == 0:
            print ("Cost after iteration %i: %f" %(i, cost))
    
    params = {"w": w,
              "b": b}
    
    grads = {"dw": dw,
             "db": db}
    
    return params, grads, costs
def predict(w, b, X):
    '''
    
    Predecir si la etiqueta es 0 o 1 utilizando los parámetros de regresión logística aprendidos (w, b)
    
    Arguments:
    w -- pesos, una matriz numpy de tamaño (num_px * num_px * 3, 1)
    b -- sesgo, un escalar
    X -- datos de tamaño (num_px * num_px * 3, número de ejemplos)
    
    Returns:
    Y_prediction -- un arreglo numpy (vector) que contiene todas las predicciones (0/1) para los ejemplos en X
    
    '''
    
    m = X.shape[1]
    Y_prediction = np.zeros((1,m))
    w = w.reshape(X.shape[0], 1)
    
    # calcular el vector "A" que predice las probabilidades de que haya un gato en la imagen
    
    A= sigmoid(np.dot(w.T,X) + b )
    
    
    for i in range(A.shape[1]):
        
        # Convertir las probabilidades A[0,i] en predicciones reales p[0,i]
        
        if A[0][i] >0.5:
            Y_prediction[0][i] = 1
        
    
    assert(Y_prediction.shape == (1, m))
    
    return Y_prediction
# GRADED FUNCTION: model

def model(X_train, Y_train, X_test, Y_test, num_iterations = 2000, learning_rate = 0.5, print_cost = False):
    """
    
    Construye el modelo de regresión logística llamando a las funciónes que has implementado previamente
    
    Arguments:
    X_train -- conjunto de entrenamiento representado por una matriz numpy de forma (num_px * num_px * 3, m_train)
    Y_train -- etiquetas de entrenamiento representadas por un arreglo numpy (vector) de forma (1, m_train)
    X_test -- conjunto de pruebas representado por un arreglo  numpy de forma (num_px * num_px * 3, m_test)
    Y_test -- etiquetas de prueba representadas por un arreglo  numpy (vector) de forma (1, m_test)
    num_iterations -- hiperparámetro que representa el número de iteraciones para optimizar los parámetros
    learning_rate -- hiperparámetro que representa la tasa de aprendizaje utilizada en la regla de actualización de optimize()
    print_cost -- Se establece en true para imprimir el coste cada 100 iteraciones
    
    Returns:
    d -- diccionario que contiene información sobre el modelo.
    """
    
    
    
    # Inicializa los parametros con 0
    w, b = initialize_with_zeros(12288)
    print(str(w.shape))
    print(str(X_train.shape))

    # Gradient descent 
    parameters, grads, costs = optimize(w,b,X_train,Y_train,num_iterations,learning_rate)
    
    # Obten los parametros w y b del diccionario "parameters"
    w = parameters["w"]
    b = parameters["b"]
    
    # Predecir ejemplos del conjunto de test/train
    print("w:" + str(w.shape))
    Y_prediction_test = predict( w , b , X_test )
    Y_prediction_train = predict( w , b , X_train )

    

    # Imprime Error del train/test
    print("train accuracy: {} %".format(100 - np.mean(np.abs(Y_prediction_train - Y_train)) * 100))
    print("test accuracy: {} %".format(100 - np.mean(np.abs(Y_prediction_test - Y_test)) * 100))

    
    d = {"costs": costs,
         "Y_prediction_test": Y_prediction_test, 
         "Y_prediction_train" : Y_prediction_train, 
         "w" : w, 
         "b" : b,
         "learning_rate" : learning_rate,
         "num_iterations": num_iterations}
    
    return d
train_dataset = h5py.File('dataset/train_catvnoncat.h5', "r")
train_set_x_orig = np.array(train_dataset["train_set_x"][:]) # train set imagenes
train_set_y = np.array(train_dataset["train_set_y"][:]).reshape(train_set_x_orig.shape[0], 1) # train set etiquetas

test_dataset = h5py.File('dataset/test_catvnoncat.h5', "r")
test_set_x_orig = np.array(test_dataset["test_set_x"][:]) # test set imagenes
test_set_y = np.array(test_dataset["test_set_y"][:]).reshape(test_set_x_orig.shape[0], 1) # test set etiquetas

#reshape
train_set_x_flatten = train_set_x_orig.reshape(train_set_x_orig.shape[0],-1)
test_set_x_flatten = test_set_x_orig.reshape(test_set_x_orig.shape[0],-1)

#normalize
train_set_x_flatten = train_set_x_flatten/255.0
test_set_x_flatten = test_set_x_flatten/255.0

#Transponer
train_set_x_flatten = train_set_x_flatten.T
train_set_y = train_set_y.T
test_set_x_flatten = test_set_x_flatten.T
test_set_y = test_set_y.T

history = model(train_set_x_flatten, train_set_y, test_set_x_flatten, test_set_y, num_iterations = 2000, learning_rate = 0.005, print_cost = True)

costs = np.squeeze(history['costs'])
plt.plot(costs)
plt.ylabel('Costo')
plt.xlabel('Iteraciones (x100)')
plt.title("Learning rate =" + str(history["learning_rate"]))
plt.show()

###Day 2

my_image = "my_image.jpg"   # change this to the name of your image file 
# We preprocess the image to fit your algorithm.

fname = "images/" + my_image
image = np.array(ndimage.imread(fname, flatten=False))
my_image = scipy.misc.imresize(image, size=(64,64)).reshape((1, 64*64*3)).T
my_predicted_image = predict(history["w"], history["b"], my_image)

plt.imshow(image)
print("y = " + str(np.squeeze(my_predicted_image)) + ", your algorithm predicts a type \"" + int(np.squeeze(my_predicted_image)), +  "\" picture.")