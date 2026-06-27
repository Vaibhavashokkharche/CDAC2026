using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Runtime.Intrinsics.X86;
using System.Text;
using System.Threading.Tasks;

namespace _42_DemoCrudAppUsingEntityFw.Models
{
    public  class Vehicle
    {
        [Key]
        public int ?  Vid { get; set; }
        public string ?  Vname { get; set; }
        public string ? Vmodel { get; set; }
        public double  ? vprice { get; set; }
        public DateOnly ? mfgdate { get; set; }
    }
}
