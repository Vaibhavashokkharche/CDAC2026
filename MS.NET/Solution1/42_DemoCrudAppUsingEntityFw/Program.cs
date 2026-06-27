using _42_DemoCrudAppUsingEntityFw.DAL;
using _42_DemoCrudAppUsingEntityFw.Models;
using Microsoft.EntityFrameworkCore.ChangeTracking.Internal;
using Microsoft.EntityFrameworkCore.Storage.Json;
using Microsoft.VisualBasic;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;

int choice = 0;
Vdbcontext vdbcontext = new Vdbcontext();   

do
{
    Console.WriteLine("1.Add New Vehicle\n 2.Update Employee By Id\n 3.Delete Employee By Id\n 4. Get All Vehicles\n5.  6.Exit\n Enter a choice"); ;
    choice = Convert.ToInt32(Console.ReadLine());

    switch (choice)
    {
        case 1:
            {
                //Console.WriteLine("Enter the vid ");
               // int vid = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter the v name");
                string? nm = Console.ReadLine();
                Console.WriteLine("Emter the model");
                string? vmodel = Console.ReadLine();
                Console.WriteLine("enter the v price");
                double? vprice = Convert.ToDouble(Console.ReadLine());
                string? vdate = Console.ReadLine();
                var date = DateOnly.Parse(vdate);
                                     //MM/DD/YYYY
                Vehicle vehicle = new Vehicle();
                //vehicle.Vid = vid;
                vehicle.Vname = nm;
                vehicle.Vmodel = vmodel;
                vehicle.vprice = vprice;
                vehicle.mfgdate = date;
                vdbcontext.vehicles.Add(vehicle);
                int n = vdbcontext.SaveChanges();
                Console.WriteLine((n > 0) ? "Vehicle Added successfully" : " Not Deleted");
                break;
            }
        case 2:
            {
                Console.WriteLine("Enter the id which you want to update");
                int id = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter the Vname");

                string ? vnm= Console.ReadLine();
                Console.WriteLine("enter the model name");
                string ? vm = Console.ReadLine();
                var v = vdbcontext.vehicles.Find(id);
                v.Vname = vnm;
                v.Vmodel = vm;
             int n =   vdbcontext.SaveChanges();
                Console.WriteLine((n > 0) ? "Vehicle Update successfully" : " Not Updated");
                break;
            }
        case 3:
            {
                Console.WriteLine("enter the id of vehicle of which you want to delete");
               int ? vid = Convert.ToInt32(Console.ReadLine());
                Vehicle ? v= vdbcontext.vehicles.Find(vid);
               vdbcontext.Remove(v);
              int n=  vdbcontext.SaveChanges();
                Console.WriteLine((n>0)? "Vehicle Deleted successfully":" Not Deleted");
                break;
            }
        case 4:
            {
                var result = vdbcontext.vehicles.ToList();
                if (result != null)
                {
                    Console.WriteLine("Vehicle available");
                    foreach (Vehicle v in result)
                    {

                        Console.WriteLine($"Vid= {v.Vid}, Vname={v.Vname}, Model= {v.Vmodel} Price = {v.vprice} Mffdate = {v.mfgdate}");
                    }
                }
                else
                {
                    Console.WriteLine("Not Found");
                }

                    break;
            }

        case 5:
            {

                Console.WriteLine("Thank your for visting ");
                break;
            }

        default:
            {

                Console.WriteLine("Invalid Choice");
                break;
            }
    }





} while (choice != 5);
