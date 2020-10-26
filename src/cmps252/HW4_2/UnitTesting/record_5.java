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

@Tag("15")
class Record_5 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 5: FirstName is Helga")
	void FirstNameOfRecord5() {
		assertEquals("Helga", customers.get(4).getFirstName());
	}

	@Test
	@DisplayName("Record 5: LastName is Rio")
	void LastNameOfRecord5() {
		assertEquals("Rio", customers.get(4).getLastName());
	}

	@Test
	@DisplayName("Record 5: Company is Pony Express")
	void CompanyOfRecord5() {
		assertEquals("Pony Express", customers.get(4).getCompany());
	}

	@Test
	@DisplayName("Record 5: Address is 5108 W Gore Blvd")
	void AddressOfRecord5() {
		assertEquals("5108 W Gore Blvd", customers.get(4).getAddress());
	}

	@Test
	@DisplayName("Record 5: City is Lawton")
	void CityOfRecord5() {
		assertEquals("Lawton", customers.get(4).getCity());
	}

	@Test
	@DisplayName("Record 5: County is Comanche")
	void CountyOfRecord5() {
		assertEquals("Comanche", customers.get(4).getCounty());
	}

	@Test
	@DisplayName("Record 5: State is OK")
	void StateOfRecord5() {
		assertEquals("OK", customers.get(4).getState());
	}

	@Test
	@DisplayName("Record 5: ZIP is 73505")
	void ZIPOfRecord5() {
		assertEquals("73505", customers.get(4).getZIP());
	}

	@Test
	@DisplayName("Record 5: Phone is 580-357-0385")
	void PhoneOfRecord5() {
		assertEquals("580-357-0385", customers.get(4).getPhone());
	}

	@Test
	@DisplayName("Record 5: Fax is 580-357-1716")
	void FaxOfRecord5() {
		assertEquals("580-357-1716", customers.get(4).getFax());
	}

	@Test
	@DisplayName("Record 5: Email is helga@rio.com")
	void EmailOfRecord5() {
		assertEquals("helga@rio.com", customers.get(4).getEmail());
	}

	@Test
	@DisplayName("Record 5: Web is http://www.helgario.com")
	void WebOfRecord5() {
		assertEquals("http://www.helgario.com", customers.get(4).getWeb());
	}
}
