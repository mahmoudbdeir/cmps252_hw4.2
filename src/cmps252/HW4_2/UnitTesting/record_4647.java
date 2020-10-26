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

@Tag("23")
class Record_4647 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4647: FirstName is Casey")
	void FirstNameOfRecord4647() {
		assertEquals("Casey", customers.get(4646).getFirstName());
	}

	@Test
	@DisplayName("Record 4647: LastName is Wynbauer")
	void LastNameOfRecord4647() {
		assertEquals("Wynbauer", customers.get(4646).getLastName());
	}

	@Test
	@DisplayName("Record 4647: Company is Ross & Jacobs Inc")
	void CompanyOfRecord4647() {
		assertEquals("Ross & Jacobs Inc", customers.get(4646).getCompany());
	}

	@Test
	@DisplayName("Record 4647: Address is 1116 Coolidge Blvd  #-d")
	void AddressOfRecord4647() {
		assertEquals("1116 Coolidge Blvd  #-d", customers.get(4646).getAddress());
	}

	@Test
	@DisplayName("Record 4647: City is Lafayette")
	void CityOfRecord4647() {
		assertEquals("Lafayette", customers.get(4646).getCity());
	}

	@Test
	@DisplayName("Record 4647: County is Lafayette")
	void CountyOfRecord4647() {
		assertEquals("Lafayette", customers.get(4646).getCounty());
	}

	@Test
	@DisplayName("Record 4647: State is LA")
	void StateOfRecord4647() {
		assertEquals("LA", customers.get(4646).getState());
	}

	@Test
	@DisplayName("Record 4647: ZIP is 70503")
	void ZIPOfRecord4647() {
		assertEquals("70503", customers.get(4646).getZIP());
	}

	@Test
	@DisplayName("Record 4647: Phone is 337-235-2967")
	void PhoneOfRecord4647() {
		assertEquals("337-235-2967", customers.get(4646).getPhone());
	}

	@Test
	@DisplayName("Record 4647: Fax is 337-235-2092")
	void FaxOfRecord4647() {
		assertEquals("337-235-2092", customers.get(4646).getFax());
	}

	@Test
	@DisplayName("Record 4647: Email is casey@wynbauer.com")
	void EmailOfRecord4647() {
		assertEquals("casey@wynbauer.com", customers.get(4646).getEmail());
	}

	@Test
	@DisplayName("Record 4647: Web is http://www.caseywynbauer.com")
	void WebOfRecord4647() {
		assertEquals("http://www.caseywynbauer.com", customers.get(4646).getWeb());
	}
}
