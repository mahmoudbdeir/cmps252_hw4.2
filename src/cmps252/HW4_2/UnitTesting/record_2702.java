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

@Tag("21")
class Record_2702 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2702: FirstName is Nicholas")
	void FirstNameOfRecord2702() {
		assertEquals("Nicholas", customers.get(2701).getFirstName());
	}

	@Test
	@DisplayName("Record 2702: LastName is Delosrios")
	void LastNameOfRecord2702() {
		assertEquals("Delosrios", customers.get(2701).getLastName());
	}

	@Test
	@DisplayName("Record 2702: Company is Indiana Telephone Assn")
	void CompanyOfRecord2702() {
		assertEquals("Indiana Telephone Assn", customers.get(2701).getCompany());
	}

	@Test
	@DisplayName("Record 2702: Address is 165 Dubois St")
	void AddressOfRecord2702() {
		assertEquals("165 Dubois St", customers.get(2701).getAddress());
	}

	@Test
	@DisplayName("Record 2702: City is Santa Cruz")
	void CityOfRecord2702() {
		assertEquals("Santa Cruz", customers.get(2701).getCity());
	}

	@Test
	@DisplayName("Record 2702: County is Santa Cruz")
	void CountyOfRecord2702() {
		assertEquals("Santa Cruz", customers.get(2701).getCounty());
	}

	@Test
	@DisplayName("Record 2702: State is CA")
	void StateOfRecord2702() {
		assertEquals("CA", customers.get(2701).getState());
	}

	@Test
	@DisplayName("Record 2702: ZIP is 95060")
	void ZIPOfRecord2702() {
		assertEquals("95060", customers.get(2701).getZIP());
	}

	@Test
	@DisplayName("Record 2702: Phone is 831-288-0068")
	void PhoneOfRecord2702() {
		assertEquals("831-288-0068", customers.get(2701).getPhone());
	}

	@Test
	@DisplayName("Record 2702: Fax is 831-288-5957")
	void FaxOfRecord2702() {
		assertEquals("831-288-5957", customers.get(2701).getFax());
	}

	@Test
	@DisplayName("Record 2702: Email is nicholas@delosrios.com")
	void EmailOfRecord2702() {
		assertEquals("nicholas@delosrios.com", customers.get(2701).getEmail());
	}

	@Test
	@DisplayName("Record 2702: Web is http://www.nicholasdelosrios.com")
	void WebOfRecord2702() {
		assertEquals("http://www.nicholasdelosrios.com", customers.get(2701).getWeb());
	}
}
