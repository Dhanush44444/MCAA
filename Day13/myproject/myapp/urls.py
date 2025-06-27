from django.urls import path
from . import views
urlpatterns = [
   path('insert_employee/',views.insert_employee,name='insert_employee'),
  path('view_employee/', views.view_employee,  name = 'view_employee'),
  path('insert_employee/<int:pk>', views.insert_employee,name = 'insert_employee'),
  path('delete_employee/<int:pk>', views.delete_employee,  name = 'delete_employee'),
  path('update_employee/<int:pk>', views.update_employee,name = 'update_employee'),
  path('insert_student/',views.insert_student,name='insert_student'),
  path('view_student/', views.view_student,  name = 'view_student'),
    
]