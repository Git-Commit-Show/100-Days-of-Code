from django.shortcuts import render
from rest_framework.decorators import api_view
from rest_framework.response import Response
from .serializers import TaskSerializer
from .models import Task
# Create your views here.

@api_view(['GET'])
def apioverview(request):
    api_urls = {
        "List" : "/task-list/",
        "Detail": "/task-detail/<str:pk>",
        "Create": "/task-create/",
        "Update": "/task-update/<str:pk>",
        "Delete": "/task-delete/<str:pk>",
    }
    return Response(api_urls)

@api_view(['GET'])
def tasklistview(request):
    tasks = Task.objects.all()
    serializer = TaskSerializer(tasks, many=True)
    return Response(serializer.data)

@api_view(['GET'])
def taskdetailview(request, pk):
    try:
        tasks = Task.objects.get(id = pk)
        serializer = TaskSerializer(tasks, many=False)
        return Response(serializer.data)

    except:
        response = {
            "Error" : "Task not found"
        }
        return Response(response)

@api_view(['POST'])
def taskcreateview(request):
    serializer = TaskSerializer(data=request.data)
    if serializer.is_valid():
        serializer.save()
        return Response({"status":"Created"})
    else:
        return Response({"Error":"Invalid Data"})

@api_view(['PATCH'])
def taskupdateview(request, pk):
    task = Task.objects.get(id=pk)
    serializer = TaskSerializer(instance=task,data=request.data)
    if serializer.is_valid():
        serializer.save()
        return Response({"status":"Updated"})
    else:
        return Response({"Error":"Invalid Data"})

    
    
