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

@Tag("48")
class Record_723 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 723: FirstName is Solomon")
	void FirstNameOfRecord723() {
		assertEquals("Solomon", customers.get(722).getFirstName());
	}

	@Test
	@DisplayName("Record 723: LastName is Schut")
	void LastNameOfRecord723() {
		assertEquals("Schut", customers.get(722).getLastName());
	}

	@Test
	@DisplayName("Record 723: Company is Paulich, Patrick M Esq")
	void CompanyOfRecord723() {
		assertEquals("Paulich, Patrick M Esq", customers.get(722).getCompany());
	}

	@Test
	@DisplayName("Record 723: Address is 1708 Crowder Rd")
	void AddressOfRecord723() {
		assertEquals("1708 Crowder Rd", customers.get(722).getAddress());
	}

	@Test
	@DisplayName("Record 723: City is Tallahassee")
	void CityOfRecord723() {
		assertEquals("Tallahassee", customers.get(722).getCity());
	}

	@Test
	@DisplayName("Record 723: County is Leon")
	void CountyOfRecord723() {
		assertEquals("Leon", customers.get(722).getCounty());
	}

	@Test
	@DisplayName("Record 723: State is FL")
	void StateOfRecord723() {
		assertEquals("FL", customers.get(722).getState());
	}

	@Test
	@DisplayName("Record 723: ZIP is 32303")
	void ZIPOfRecord723() {
		assertEquals("32303", customers.get(722).getZIP());
	}

	@Test
	@DisplayName("Record 723: Phone is 850-562-9078")
	void PhoneOfRecord723() {
		assertEquals("850-562-9078", customers.get(722).getPhone());
	}

	@Test
	@DisplayName("Record 723: Fax is 850-562-5464")
	void FaxOfRecord723() {
		assertEquals("850-562-5464", customers.get(722).getFax());
	}

	@Test
	@DisplayName("Record 723: Email is solomon@schut.com")
	void EmailOfRecord723() {
		assertEquals("solomon@schut.com", customers.get(722).getEmail());
	}

	@Test
	@DisplayName("Record 723: Web is http://www.solomonschut.com")
	void WebOfRecord723() {
		assertEquals("http://www.solomonschut.com", customers.get(722).getWeb());
	}
}
