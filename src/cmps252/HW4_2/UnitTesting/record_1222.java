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

@Tag("45")
class Record_1222 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1222: FirstName is Emily")
	void FirstNameOfRecord1222() {
		assertEquals("Emily", customers.get(1221).getFirstName());
	}

	@Test
	@DisplayName("Record 1222: LastName is Blessett")
	void LastNameOfRecord1222() {
		assertEquals("Blessett", customers.get(1221).getLastName());
	}

	@Test
	@DisplayName("Record 1222: Company is United Exporters Company")
	void CompanyOfRecord1222() {
		assertEquals("United Exporters Company", customers.get(1221).getCompany());
	}

	@Test
	@DisplayName("Record 1222: Address is 611 13th Ave S")
	void AddressOfRecord1222() {
		assertEquals("611 13th Ave S", customers.get(1221).getAddress());
	}

	@Test
	@DisplayName("Record 1222: City is Hopkins")
	void CityOfRecord1222() {
		assertEquals("Hopkins", customers.get(1221).getCity());
	}

	@Test
	@DisplayName("Record 1222: County is Hennepin")
	void CountyOfRecord1222() {
		assertEquals("Hennepin", customers.get(1221).getCounty());
	}

	@Test
	@DisplayName("Record 1222: State is MN")
	void StateOfRecord1222() {
		assertEquals("MN", customers.get(1221).getState());
	}

	@Test
	@DisplayName("Record 1222: ZIP is 55343")
	void ZIPOfRecord1222() {
		assertEquals("55343", customers.get(1221).getZIP());
	}

	@Test
	@DisplayName("Record 1222: Phone is 952-936-5585")
	void PhoneOfRecord1222() {
		assertEquals("952-936-5585", customers.get(1221).getPhone());
	}

	@Test
	@DisplayName("Record 1222: Fax is 952-936-4709")
	void FaxOfRecord1222() {
		assertEquals("952-936-4709", customers.get(1221).getFax());
	}

	@Test
	@DisplayName("Record 1222: Email is emily@blessett.com")
	void EmailOfRecord1222() {
		assertEquals("emily@blessett.com", customers.get(1221).getEmail());
	}

	@Test
	@DisplayName("Record 1222: Web is http://www.emilyblessett.com")
	void WebOfRecord1222() {
		assertEquals("http://www.emilyblessett.com", customers.get(1221).getWeb());
	}
}
