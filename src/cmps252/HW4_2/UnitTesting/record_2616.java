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

@Tag("3")
class Record_2616 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2616: FirstName is Margie")
	void FirstNameOfRecord2616() {
		assertEquals("Margie", customers.get(2615).getFirstName());
	}

	@Test
	@DisplayName("Record 2616: LastName is Chamblin")
	void LastNameOfRecord2616() {
		assertEquals("Chamblin", customers.get(2615).getLastName());
	}

	@Test
	@DisplayName("Record 2616: Company is Paul Addi French Room Lingerie")
	void CompanyOfRecord2616() {
		assertEquals("Paul Addi French Room Lingerie", customers.get(2615).getCompany());
	}

	@Test
	@DisplayName("Record 2616: Address is 5138 Brooks St  #-3")
	void AddressOfRecord2616() {
		assertEquals("5138 Brooks St  #-3", customers.get(2615).getAddress());
	}

	@Test
	@DisplayName("Record 2616: City is Montclair")
	void CityOfRecord2616() {
		assertEquals("Montclair", customers.get(2615).getCity());
	}

	@Test
	@DisplayName("Record 2616: County is San Bernardino")
	void CountyOfRecord2616() {
		assertEquals("San Bernardino", customers.get(2615).getCounty());
	}

	@Test
	@DisplayName("Record 2616: State is CA")
	void StateOfRecord2616() {
		assertEquals("CA", customers.get(2615).getState());
	}

	@Test
	@DisplayName("Record 2616: ZIP is 91763")
	void ZIPOfRecord2616() {
		assertEquals("91763", customers.get(2615).getZIP());
	}

	@Test
	@DisplayName("Record 2616: Phone is 909-624-4116")
	void PhoneOfRecord2616() {
		assertEquals("909-624-4116", customers.get(2615).getPhone());
	}

	@Test
	@DisplayName("Record 2616: Fax is 909-624-6168")
	void FaxOfRecord2616() {
		assertEquals("909-624-6168", customers.get(2615).getFax());
	}

	@Test
	@DisplayName("Record 2616: Email is margie@chamblin.com")
	void EmailOfRecord2616() {
		assertEquals("margie@chamblin.com", customers.get(2615).getEmail());
	}

	@Test
	@DisplayName("Record 2616: Web is http://www.margiechamblin.com")
	void WebOfRecord2616() {
		assertEquals("http://www.margiechamblin.com", customers.get(2615).getWeb());
	}
}
