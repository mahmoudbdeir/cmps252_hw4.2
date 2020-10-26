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

@Tag("17")
class Record_4578 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4578: FirstName is Hillary")
	void FirstNameOfRecord4578() {
		assertEquals("Hillary", customers.get(4577).getFirstName());
	}

	@Test
	@DisplayName("Record 4578: LastName is Mahoe")
	void LastNameOfRecord4578() {
		assertEquals("Mahoe", customers.get(4577).getLastName());
	}

	@Test
	@DisplayName("Record 4578: Company is Williams, Jerry L Esq")
	void CompanyOfRecord4578() {
		assertEquals("Williams, Jerry L Esq", customers.get(4577).getCompany());
	}

	@Test
	@DisplayName("Record 4578: Address is 5910 S Crescent Blvd")
	void AddressOfRecord4578() {
		assertEquals("5910 S Crescent Blvd", customers.get(4577).getAddress());
	}

	@Test
	@DisplayName("Record 4578: City is Merchantville")
	void CityOfRecord4578() {
		assertEquals("Merchantville", customers.get(4577).getCity());
	}

	@Test
	@DisplayName("Record 4578: County is Camden")
	void CountyOfRecord4578() {
		assertEquals("Camden", customers.get(4577).getCounty());
	}

	@Test
	@DisplayName("Record 4578: State is NJ")
	void StateOfRecord4578() {
		assertEquals("NJ", customers.get(4577).getState());
	}

	@Test
	@DisplayName("Record 4578: ZIP is 8109")
	void ZIPOfRecord4578() {
		assertEquals("8109", customers.get(4577).getZIP());
	}

	@Test
	@DisplayName("Record 4578: Phone is 856-488-8350")
	void PhoneOfRecord4578() {
		assertEquals("856-488-8350", customers.get(4577).getPhone());
	}

	@Test
	@DisplayName("Record 4578: Fax is 856-488-7208")
	void FaxOfRecord4578() {
		assertEquals("856-488-7208", customers.get(4577).getFax());
	}

	@Test
	@DisplayName("Record 4578: Email is hillary@mahoe.com")
	void EmailOfRecord4578() {
		assertEquals("hillary@mahoe.com", customers.get(4577).getEmail());
	}

	@Test
	@DisplayName("Record 4578: Web is http://www.hillarymahoe.com")
	void WebOfRecord4578() {
		assertEquals("http://www.hillarymahoe.com", customers.get(4577).getWeb());
	}
}
