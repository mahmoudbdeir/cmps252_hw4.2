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

@Tag("16")
class Record_1175 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1175: FirstName is Liliana")
	void FirstNameOfRecord1175() {
		assertEquals("Liliana", customers.get(1174).getFirstName());
	}

	@Test
	@DisplayName("Record 1175: LastName is Vanorsdol")
	void LastNameOfRecord1175() {
		assertEquals("Vanorsdol", customers.get(1174).getLastName());
	}

	@Test
	@DisplayName("Record 1175: Company is Mhr")
	void CompanyOfRecord1175() {
		assertEquals("Mhr", customers.get(1174).getCompany());
	}

	@Test
	@DisplayName("Record 1175: Address is 5200 Smith Rd")
	void AddressOfRecord1175() {
		assertEquals("5200 Smith Rd", customers.get(1174).getAddress());
	}

	@Test
	@DisplayName("Record 1175: City is Denver")
	void CityOfRecord1175() {
		assertEquals("Denver", customers.get(1174).getCity());
	}

	@Test
	@DisplayName("Record 1175: County is Denver")
	void CountyOfRecord1175() {
		assertEquals("Denver", customers.get(1174).getCounty());
	}

	@Test
	@DisplayName("Record 1175: State is CO")
	void StateOfRecord1175() {
		assertEquals("CO", customers.get(1174).getState());
	}

	@Test
	@DisplayName("Record 1175: ZIP is 80216")
	void ZIPOfRecord1175() {
		assertEquals("80216", customers.get(1174).getZIP());
	}

	@Test
	@DisplayName("Record 1175: Phone is 303-329-0308")
	void PhoneOfRecord1175() {
		assertEquals("303-329-0308", customers.get(1174).getPhone());
	}

	@Test
	@DisplayName("Record 1175: Fax is 303-329-8574")
	void FaxOfRecord1175() {
		assertEquals("303-329-8574", customers.get(1174).getFax());
	}

	@Test
	@DisplayName("Record 1175: Email is liliana@vanorsdol.com")
	void EmailOfRecord1175() {
		assertEquals("liliana@vanorsdol.com", customers.get(1174).getEmail());
	}

	@Test
	@DisplayName("Record 1175: Web is http://www.lilianavanorsdol.com")
	void WebOfRecord1175() {
		assertEquals("http://www.lilianavanorsdol.com", customers.get(1174).getWeb());
	}
}
