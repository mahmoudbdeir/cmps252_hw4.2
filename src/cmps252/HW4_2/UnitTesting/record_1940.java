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

@Tag("22")
class Record_1940 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1940: FirstName is Wendi")
	void FirstNameOfRecord1940() {
		assertEquals("Wendi", customers.get(1939).getFirstName());
	}

	@Test
	@DisplayName("Record 1940: LastName is Livi")
	void LastNameOfRecord1940() {
		assertEquals("Livi", customers.get(1939).getLastName());
	}

	@Test
	@DisplayName("Record 1940: Company is Forbes, Rodney E Esq")
	void CompanyOfRecord1940() {
		assertEquals("Forbes, Rodney E Esq", customers.get(1939).getCompany());
	}

	@Test
	@DisplayName("Record 1940: Address is 101 Castle Creek Rd")
	void AddressOfRecord1940() {
		assertEquals("101 Castle Creek Rd", customers.get(1939).getAddress());
	}

	@Test
	@DisplayName("Record 1940: City is Binghamton")
	void CityOfRecord1940() {
		assertEquals("Binghamton", customers.get(1939).getCity());
	}

	@Test
	@DisplayName("Record 1940: County is Broome")
	void CountyOfRecord1940() {
		assertEquals("Broome", customers.get(1939).getCounty());
	}

	@Test
	@DisplayName("Record 1940: State is NY")
	void StateOfRecord1940() {
		assertEquals("NY", customers.get(1939).getState());
	}

	@Test
	@DisplayName("Record 1940: ZIP is 13901")
	void ZIPOfRecord1940() {
		assertEquals("13901", customers.get(1939).getZIP());
	}

	@Test
	@DisplayName("Record 1940: Phone is 607-722-6987")
	void PhoneOfRecord1940() {
		assertEquals("607-722-6987", customers.get(1939).getPhone());
	}

	@Test
	@DisplayName("Record 1940: Fax is 607-722-1917")
	void FaxOfRecord1940() {
		assertEquals("607-722-1917", customers.get(1939).getFax());
	}

	@Test
	@DisplayName("Record 1940: Email is wendi@livi.com")
	void EmailOfRecord1940() {
		assertEquals("wendi@livi.com", customers.get(1939).getEmail());
	}

	@Test
	@DisplayName("Record 1940: Web is http://www.wendilivi.com")
	void WebOfRecord1940() {
		assertEquals("http://www.wendilivi.com", customers.get(1939).getWeb());
	}
}
