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

@Tag("19")
class Record_400 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 400: FirstName is Lea")
	void FirstNameOfRecord400() {
		assertEquals("Lea", customers.get(399).getFirstName());
	}

	@Test
	@DisplayName("Record 400: LastName is Dunton")
	void LastNameOfRecord400() {
		assertEquals("Dunton", customers.get(399).getLastName());
	}

	@Test
	@DisplayName("Record 400: Company is Insty Prints")
	void CompanyOfRecord400() {
		assertEquals("Insty Prints", customers.get(399).getCompany());
	}

	@Test
	@DisplayName("Record 400: Address is 559 6th St")
	void AddressOfRecord400() {
		assertEquals("559 6th St", customers.get(399).getAddress());
	}

	@Test
	@DisplayName("Record 400: City is San Francisco")
	void CityOfRecord400() {
		assertEquals("San Francisco", customers.get(399).getCity());
	}

	@Test
	@DisplayName("Record 400: County is San Francisco")
	void CountyOfRecord400() {
		assertEquals("San Francisco", customers.get(399).getCounty());
	}

	@Test
	@DisplayName("Record 400: State is CA")
	void StateOfRecord400() {
		assertEquals("CA", customers.get(399).getState());
	}

	@Test
	@DisplayName("Record 400: ZIP is 94103")
	void ZIPOfRecord400() {
		assertEquals("94103", customers.get(399).getZIP());
	}

	@Test
	@DisplayName("Record 400: Phone is 415-957-3497")
	void PhoneOfRecord400() {
		assertEquals("415-957-3497", customers.get(399).getPhone());
	}

	@Test
	@DisplayName("Record 400: Fax is 415-957-3778")
	void FaxOfRecord400() {
		assertEquals("415-957-3778", customers.get(399).getFax());
	}

	@Test
	@DisplayName("Record 400: Email is lea@dunton.com")
	void EmailOfRecord400() {
		assertEquals("lea@dunton.com", customers.get(399).getEmail());
	}

	@Test
	@DisplayName("Record 400: Web is http://www.leadunton.com")
	void WebOfRecord400() {
		assertEquals("http://www.leadunton.com", customers.get(399).getWeb());
	}
}
