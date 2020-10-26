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

@Tag("38")
class Record_920 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 920: FirstName is Jewell")
	void FirstNameOfRecord920() {
		assertEquals("Jewell", customers.get(919).getFirstName());
	}

	@Test
	@DisplayName("Record 920: LastName is Nantanapibul")
	void LastNameOfRecord920() {
		assertEquals("Nantanapibul", customers.get(919).getLastName());
	}

	@Test
	@DisplayName("Record 920: Company is Ramada Inn North Orlando")
	void CompanyOfRecord920() {
		assertEquals("Ramada Inn North Orlando", customers.get(919).getCompany());
	}

	@Test
	@DisplayName("Record 920: Address is 35 Oak Ridge Rd")
	void AddressOfRecord920() {
		assertEquals("35 Oak Ridge Rd", customers.get(919).getAddress());
	}

	@Test
	@DisplayName("Record 920: City is Newfoundland")
	void CityOfRecord920() {
		assertEquals("Newfoundland", customers.get(919).getCity());
	}

	@Test
	@DisplayName("Record 920: County is Passaic")
	void CountyOfRecord920() {
		assertEquals("Passaic", customers.get(919).getCounty());
	}

	@Test
	@DisplayName("Record 920: State is NJ")
	void StateOfRecord920() {
		assertEquals("NJ", customers.get(919).getState());
	}

	@Test
	@DisplayName("Record 920: ZIP is 7435")
	void ZIPOfRecord920() {
		assertEquals("7435", customers.get(919).getZIP());
	}

	@Test
	@DisplayName("Record 920: Phone is 973-697-7785")
	void PhoneOfRecord920() {
		assertEquals("973-697-7785", customers.get(919).getPhone());
	}

	@Test
	@DisplayName("Record 920: Fax is 973-697-9898")
	void FaxOfRecord920() {
		assertEquals("973-697-9898", customers.get(919).getFax());
	}

	@Test
	@DisplayName("Record 920: Email is jewell@nantanapibul.com")
	void EmailOfRecord920() {
		assertEquals("jewell@nantanapibul.com", customers.get(919).getEmail());
	}

	@Test
	@DisplayName("Record 920: Web is http://www.jewellnantanapibul.com")
	void WebOfRecord920() {
		assertEquals("http://www.jewellnantanapibul.com", customers.get(919).getWeb());
	}
}
