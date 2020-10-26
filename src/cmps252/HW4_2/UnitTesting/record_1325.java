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
class Record_1325 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1325: FirstName is Misty")
	void FirstNameOfRecord1325() {
		assertEquals("Misty", customers.get(1324).getFirstName());
	}

	@Test
	@DisplayName("Record 1325: LastName is Danish")
	void LastNameOfRecord1325() {
		assertEquals("Danish", customers.get(1324).getLastName());
	}

	@Test
	@DisplayName("Record 1325: Company is Greenbook Inc")
	void CompanyOfRecord1325() {
		assertEquals("Greenbook Inc", customers.get(1324).getCompany());
	}

	@Test
	@DisplayName("Record 1325: Address is 160 Talmadge Rd")
	void AddressOfRecord1325() {
		assertEquals("160 Talmadge Rd", customers.get(1324).getAddress());
	}

	@Test
	@DisplayName("Record 1325: City is Edison")
	void CityOfRecord1325() {
		assertEquals("Edison", customers.get(1324).getCity());
	}

	@Test
	@DisplayName("Record 1325: County is Middlesex")
	void CountyOfRecord1325() {
		assertEquals("Middlesex", customers.get(1324).getCounty());
	}

	@Test
	@DisplayName("Record 1325: State is NJ")
	void StateOfRecord1325() {
		assertEquals("NJ", customers.get(1324).getState());
	}

	@Test
	@DisplayName("Record 1325: ZIP is 8817")
	void ZIPOfRecord1325() {
		assertEquals("8817", customers.get(1324).getZIP());
	}

	@Test
	@DisplayName("Record 1325: Phone is 732-287-0391")
	void PhoneOfRecord1325() {
		assertEquals("732-287-0391", customers.get(1324).getPhone());
	}

	@Test
	@DisplayName("Record 1325: Fax is 732-287-1428")
	void FaxOfRecord1325() {
		assertEquals("732-287-1428", customers.get(1324).getFax());
	}

	@Test
	@DisplayName("Record 1325: Email is misty@danish.com")
	void EmailOfRecord1325() {
		assertEquals("misty@danish.com", customers.get(1324).getEmail());
	}

	@Test
	@DisplayName("Record 1325: Web is http://www.mistydanish.com")
	void WebOfRecord1325() {
		assertEquals("http://www.mistydanish.com", customers.get(1324).getWeb());
	}
}
