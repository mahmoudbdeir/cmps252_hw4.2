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

@Tag("35")
class Record_1583 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1583: FirstName is Joseph")
	void FirstNameOfRecord1583() {
		assertEquals("Joseph", customers.get(1582).getFirstName());
	}

	@Test
	@DisplayName("Record 1583: LastName is Corza")
	void LastNameOfRecord1583() {
		assertEquals("Corza", customers.get(1582).getLastName());
	}

	@Test
	@DisplayName("Record 1583: Company is De Leers Construction Inc")
	void CompanyOfRecord1583() {
		assertEquals("De Leers Construction Inc", customers.get(1582).getCompany());
	}

	@Test
	@DisplayName("Record 1583: Address is 5183 W Western Reserve Rd")
	void AddressOfRecord1583() {
		assertEquals("5183 W Western Reserve Rd", customers.get(1582).getAddress());
	}

	@Test
	@DisplayName("Record 1583: City is Canfield")
	void CityOfRecord1583() {
		assertEquals("Canfield", customers.get(1582).getCity());
	}

	@Test
	@DisplayName("Record 1583: County is Mahoning")
	void CountyOfRecord1583() {
		assertEquals("Mahoning", customers.get(1582).getCounty());
	}

	@Test
	@DisplayName("Record 1583: State is OH")
	void StateOfRecord1583() {
		assertEquals("OH", customers.get(1582).getState());
	}

	@Test
	@DisplayName("Record 1583: ZIP is 44406")
	void ZIPOfRecord1583() {
		assertEquals("44406", customers.get(1582).getZIP());
	}

	@Test
	@DisplayName("Record 1583: Phone is 330-533-7086")
	void PhoneOfRecord1583() {
		assertEquals("330-533-7086", customers.get(1582).getPhone());
	}

	@Test
	@DisplayName("Record 1583: Fax is 330-533-4433")
	void FaxOfRecord1583() {
		assertEquals("330-533-4433", customers.get(1582).getFax());
	}

	@Test
	@DisplayName("Record 1583: Email is joseph@corza.com")
	void EmailOfRecord1583() {
		assertEquals("joseph@corza.com", customers.get(1582).getEmail());
	}

	@Test
	@DisplayName("Record 1583: Web is http://www.josephcorza.com")
	void WebOfRecord1583() {
		assertEquals("http://www.josephcorza.com", customers.get(1582).getWeb());
	}
}
