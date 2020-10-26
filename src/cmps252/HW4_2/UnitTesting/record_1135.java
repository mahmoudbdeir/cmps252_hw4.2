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

@Tag("7")
class Record_1135 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1135: FirstName is Sammie")
	void FirstNameOfRecord1135() {
		assertEquals("Sammie", customers.get(1134).getFirstName());
	}

	@Test
	@DisplayName("Record 1135: LastName is Baj")
	void LastNameOfRecord1135() {
		assertEquals("Baj", customers.get(1134).getLastName());
	}

	@Test
	@DisplayName("Record 1135: Company is Thomas W Ruff And Co Of Fl")
	void CompanyOfRecord1135() {
		assertEquals("Thomas W Ruff And Co Of Fl", customers.get(1134).getCompany());
	}

	@Test
	@DisplayName("Record 1135: Address is 5124 W Peoria Ave")
	void AddressOfRecord1135() {
		assertEquals("5124 W Peoria Ave", customers.get(1134).getAddress());
	}

	@Test
	@DisplayName("Record 1135: City is Glendale")
	void CityOfRecord1135() {
		assertEquals("Glendale", customers.get(1134).getCity());
	}

	@Test
	@DisplayName("Record 1135: County is Maricopa")
	void CountyOfRecord1135() {
		assertEquals("Maricopa", customers.get(1134).getCounty());
	}

	@Test
	@DisplayName("Record 1135: State is AZ")
	void StateOfRecord1135() {
		assertEquals("AZ", customers.get(1134).getState());
	}

	@Test
	@DisplayName("Record 1135: ZIP is 85302")
	void ZIPOfRecord1135() {
		assertEquals("85302", customers.get(1134).getZIP());
	}

	@Test
	@DisplayName("Record 1135: Phone is 623-412-4778")
	void PhoneOfRecord1135() {
		assertEquals("623-412-4778", customers.get(1134).getPhone());
	}

	@Test
	@DisplayName("Record 1135: Fax is 623-412-2163")
	void FaxOfRecord1135() {
		assertEquals("623-412-2163", customers.get(1134).getFax());
	}

	@Test
	@DisplayName("Record 1135: Email is sammie@baj.com")
	void EmailOfRecord1135() {
		assertEquals("sammie@baj.com", customers.get(1134).getEmail());
	}

	@Test
	@DisplayName("Record 1135: Web is http://www.sammiebaj.com")
	void WebOfRecord1135() {
		assertEquals("http://www.sammiebaj.com", customers.get(1134).getWeb());
	}
}
