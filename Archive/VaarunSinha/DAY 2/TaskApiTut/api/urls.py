from django.urls import path
from .views import apioverview, tasklistview, taskdetailview, taskcreateview, taskupdateview

urlpatterns = [
    path('', apioverview, name='apioverview'),
    path('task-list/', tasklistview, name='tasklist'),
    path('task-detail/<str:pk>/', taskdetailview, name='taskdetail'),
    path('task-create/', taskcreateview, name='taskcreate'),
    path('task-update/<str:pk>/', taskupdateview, name='taskupdate'),
  ]
