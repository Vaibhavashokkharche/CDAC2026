using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace _42_DemoCrudAppUsingEntityFw.Migrations
{
    /// <inheritdoc />
    public partial class IntialCommit : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "vehicles",
                columns: table => new
                {
                    Vid = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    Vname = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    Vmodel = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    vprice = table.Column<double>(type: "float", nullable: true),
                    mfgdate = table.Column<DateOnly>(type: "date", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_vehicles", x => x.Vid);
                });
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "vehicles");
        }
    }
}
