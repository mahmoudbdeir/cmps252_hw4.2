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

@Tag("0")
class Record_3907 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3907: FirstName is Carlton")
	void FirstNameOfRecord3907() {
		assertEquals("Carlton", customers.get(3906).getFirstName());
	}

	@Test
	@DisplayName("Record 3907: LastName is Chervin")
	void LastNameOfRecord3907() {
		assertEquals("Chervin", customers.get(3906).getLastName());
	}

	@Test
	@DisplayName("Record 3907: Company is Dakota Bus Service Inc")
	void CompanyOfRecord3907() {
		assertEquals("Dakota Bus Service Inc", customers.get(3906).getCompany());
	}

	@Test
	@DisplayName("Record 3907: Address is 7700 Wisconsin Ave")
	void AddressOfRecord3907() {
		assertEquals("7700 Wisconsin Ave", customers.get(3906).getAddress());
	}

	@Test
	@DisplayName("Record 3907: City is Bethesda")
	void CityOfRecord3907() {
		assertEquals("Bethesda", customers.get(3906).getCity());
	}

	@Test
	@DisplayName("Record 3907: County is Montgomery")
	void CountyOfRecord3907() {
		assertEquals("Montgomery", customers.get(3906).getCounty());
	}

	@Test
	@DisplayName("Record 3907: State is MD")
	void StateOfRecord3907() {
		assertEquals("MD", customers.get(3906).getState());
	}

	@Test
	@DisplayName("Record 3907: ZIP is 20814")
	void ZIPOfRecord3907() {
		assertEquals("20814", customers.get(3906).getZIP());
	}

	@Test
	@DisplayName("Record 3907: Phone is 301-657-0937")
	void PhoneOfRecord3907() {
		assertEquals("301-657-0937", customers.get(3906).getPhone());
	}

	@Test
	@DisplayName("Record 3907: Fax is 301-657-7064")
	void FaxOfRecord3907() {
		assertEquals("301-657-7064", customers.get(3906).getFax());
	}

	@Test
	@DisplayName("Record 3907: Email is carlton@chervin.com")
	void EmailOfRecord3907() {
		assertEquals("carlton@chervin.com", customers.get(3906).getEmail());
	}

	@Test
	@DisplayName("Record 3907: Web is http://www.carltonchervin.com")
	void WebOfRecord3907() {
		assertEquals("http://www.carltonchervin.com", customers.get(3906).getWeb());
	}
}
