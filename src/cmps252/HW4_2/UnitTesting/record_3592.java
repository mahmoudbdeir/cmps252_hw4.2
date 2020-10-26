package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("3")
class Record_3592 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3592: FirstName is Verda")
	void FirstNameOfRecord3592() {
		assertEquals("Verda", customers.get(3591).getFirstName());
	}

	@Test
	@DisplayName("Record 3592: LastName is Pehowic")
	void LastNameOfRecord3592() {
		assertEquals("Pehowic", customers.get(3591).getLastName());
	}

	@Test
	@DisplayName("Record 3592: Company is Root Photgrs")
	void CompanyOfRecord3592() {
		assertEquals("Root Photgrs", customers.get(3591).getCompany());
	}

	@Test
	@DisplayName("Record 3592: Address is 800 E 28th St")
	void AddressOfRecord3592() {
		assertEquals("800 E 28th St", customers.get(3591).getAddress());
	}

	@Test
	@DisplayName("Record 3592: City is Minneapolis")
	void CityOfRecord3592() {
		assertEquals("Minneapolis", customers.get(3591).getCity());
	}

	@Test
	@DisplayName("Record 3592: County is Hennepin")
	void CountyOfRecord3592() {
		assertEquals("Hennepin", customers.get(3591).getCounty());
	}

	@Test
	@DisplayName("Record 3592: State is MN")
	void StateOfRecord3592() {
		assertEquals("MN", customers.get(3591).getState());
	}

	@Test
	@DisplayName("Record 3592: ZIP is 55407")
	void ZIPOfRecord3592() {
		assertEquals("55407", customers.get(3591).getZIP());
	}

	@Test
	@DisplayName("Record 3592: Phone is 612-863-8965")
	void PhoneOfRecord3592() {
		assertEquals("612-863-8965", customers.get(3591).getPhone());
	}

	@Test
	@DisplayName("Record 3592: Fax is 612-863-6552")
	void FaxOfRecord3592() {
		assertEquals("612-863-6552", customers.get(3591).getFax());
	}

	@Test
	@DisplayName("Record 3592: Email is verda@pehowic.com")
	void EmailOfRecord3592() {
		assertEquals("verda@pehowic.com", customers.get(3591).getEmail());
	}

	@Test
	@DisplayName("Record 3592: Web is http://www.verdapehowic.com")
	void WebOfRecord3592() {
		assertEquals("http://www.verdapehowic.com", customers.get(3591).getWeb());
	}
}
