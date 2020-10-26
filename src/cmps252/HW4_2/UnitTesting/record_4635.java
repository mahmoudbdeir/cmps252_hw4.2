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

@Tag("40")
class Record_4635 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4635: FirstName is Larry")
	void FirstNameOfRecord4635() {
		assertEquals("Larry", customers.get(4634).getFirstName());
	}

	@Test
	@DisplayName("Record 4635: LastName is Ferandez")
	void LastNameOfRecord4635() {
		assertEquals("Ferandez", customers.get(4634).getLastName());
	}

	@Test
	@DisplayName("Record 4635: Company is R E C A P")
	void CompanyOfRecord4635() {
		assertEquals("R E C A P", customers.get(4634).getCompany());
	}

	@Test
	@DisplayName("Record 4635: Address is 102 Sunbeam Ln")
	void AddressOfRecord4635() {
		assertEquals("102 Sunbeam Ln", customers.get(4634).getAddress());
	}

	@Test
	@DisplayName("Record 4635: City is Lafayette")
	void CityOfRecord4635() {
		assertEquals("Lafayette", customers.get(4634).getCity());
	}

	@Test
	@DisplayName("Record 4635: County is Lafayette")
	void CountyOfRecord4635() {
		assertEquals("Lafayette", customers.get(4634).getCounty());
	}

	@Test
	@DisplayName("Record 4635: State is LA")
	void StateOfRecord4635() {
		assertEquals("LA", customers.get(4634).getState());
	}

	@Test
	@DisplayName("Record 4635: ZIP is 70506")
	void ZIPOfRecord4635() {
		assertEquals("70506", customers.get(4634).getZIP());
	}

	@Test
	@DisplayName("Record 4635: Phone is 337-233-4929")
	void PhoneOfRecord4635() {
		assertEquals("337-233-4929", customers.get(4634).getPhone());
	}

	@Test
	@DisplayName("Record 4635: Fax is 337-233-5269")
	void FaxOfRecord4635() {
		assertEquals("337-233-5269", customers.get(4634).getFax());
	}

	@Test
	@DisplayName("Record 4635: Email is larry@ferandez.com")
	void EmailOfRecord4635() {
		assertEquals("larry@ferandez.com", customers.get(4634).getEmail());
	}

	@Test
	@DisplayName("Record 4635: Web is http://www.larryferandez.com")
	void WebOfRecord4635() {
		assertEquals("http://www.larryferandez.com", customers.get(4634).getWeb());
	}
}
