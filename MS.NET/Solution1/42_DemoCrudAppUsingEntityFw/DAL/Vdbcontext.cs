using _42_DemoCrudAppUsingEntityFw.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;


namespace _42_DemoCrudAppUsingEntityFw.DAL

{
    public class Vdbcontext : DbContext
    {
        public DbSet<Vehicle> vehicles { get; set; }


        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            // Service to read config file
            // A service to read appsettings.json file
            var builder = new ConfigurationBuilder();
             
            // Path : bin/debug/.Net9.0/application.dll
            builder.SetBasePath(Directory.GetCurrentDirectory());

            // Path : bin/debug/.Net9.0/appsettings.json
            builder.AddJsonFile("appsettings.json");

            IConfiguration config = builder.Build();

            optionsBuilder.UseSqlServer(config.GetConnectionString("conStr"));





        }

    }
}
