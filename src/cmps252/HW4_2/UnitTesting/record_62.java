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

@Tag("20")
class Record_62 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 62: FirstName is Liza")
	void FirstNameOfRecord62() {
		assertEquals("Liza", customers.get(61).getFirstName());
	}

	@Test
	@DisplayName("Record 62: LastName is Soller")
	void LastNameOfRecord62() {
		assertEquals("Soller", customers.get(61).getLastName());
	}

	@Test
	@DisplayName("Record 62: Company is Kiss International")
	void CompanyOfRecord62() {
		assertEquals("Kiss International", customers.get(61).getCompany());
	}

	@Test
	@DisplayName("Record 62: Address is 80 Hendrickson Rd")
	void AddressOfRecord62() {
		assertEquals("80 Hendrickson Rd", customers.get(61).getAddress());
	}

	@Test
	@DisplayName("Record 62: City is Freehold")
	void CityOfRecord62() {
		assertEquals("Freehold", customers.get(61).getCity());
	}

	@Test
	@DisplayName("Record 62: County is Monmouth")
	void CountyOfRecord62() {
		assertEquals("Monmouth", customers.get(61).getCounty());
	}

	@Test
	@DisplayName("Record 62: State is NJ")
	void StateOfRecord62() {
		assertEquals("NJ", customers.get(61).getState());
	}

	@Test
	@DisplayName("Record 62: ZIP is 7728")
	void ZIPOfRecord62() {
		assertEquals("7728", customers.get(61).getZIP());
	}

	@Test
	@DisplayName("Record 62: Phone is 732-780-3681")
	void PhoneOfRecord62() {
		assertEquals("732-780-3681", customers.get(61).getPhone());
	}

	@Test
	@DisplayName("Record 62: Fax is 732-780-5593")
	void FaxOfRecord62() {
		assertEquals("732-780-5593", customers.get(61).getFax());
	}

	@Test
	@DisplayName("Record 62: Email is liza@soller.com")
	void EmailOfRecord62() {
		assertEquals("liza@soller.com", customers.get(61).getEmail());
	}

	@Test
	@DisplayName("Record 62: Web is http://www.lizasoller.com")
	void WebOfRecord62() {
		assertEquals("http://www.lizasoller.com", customers.get(61).getWeb());
	}
}
