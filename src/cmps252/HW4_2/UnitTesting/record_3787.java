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

@Tag("22")
class Record_3787 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3787: FirstName is Juan")
	void FirstNameOfRecord3787() {
		assertEquals("Juan", customers.get(3786).getFirstName());
	}

	@Test
	@DisplayName("Record 3787: LastName is Cue")
	void LastNameOfRecord3787() {
		assertEquals("Cue", customers.get(3786).getLastName());
	}

	@Test
	@DisplayName("Record 3787: Company is Town House Motel")
	void CompanyOfRecord3787() {
		assertEquals("Town House Motel", customers.get(3786).getCompany());
	}

	@Test
	@DisplayName("Record 3787: Address is 3105 18th St")
	void AddressOfRecord3787() {
		assertEquals("3105 18th St", customers.get(3786).getAddress());
	}

	@Test
	@DisplayName("Record 3787: City is Metairie")
	void CityOfRecord3787() {
		assertEquals("Metairie", customers.get(3786).getCity());
	}

	@Test
	@DisplayName("Record 3787: County is Jefferson")
	void CountyOfRecord3787() {
		assertEquals("Jefferson", customers.get(3786).getCounty());
	}

	@Test
	@DisplayName("Record 3787: State is LA")
	void StateOfRecord3787() {
		assertEquals("LA", customers.get(3786).getState());
	}

	@Test
	@DisplayName("Record 3787: ZIP is 70002")
	void ZIPOfRecord3787() {
		assertEquals("70002", customers.get(3786).getZIP());
	}

	@Test
	@DisplayName("Record 3787: Phone is 504-832-7787")
	void PhoneOfRecord3787() {
		assertEquals("504-832-7787", customers.get(3786).getPhone());
	}

	@Test
	@DisplayName("Record 3787: Fax is 504-832-1513")
	void FaxOfRecord3787() {
		assertEquals("504-832-1513", customers.get(3786).getFax());
	}

	@Test
	@DisplayName("Record 3787: Email is juan@cue.com")
	void EmailOfRecord3787() {
		assertEquals("juan@cue.com", customers.get(3786).getEmail());
	}

	@Test
	@DisplayName("Record 3787: Web is http://www.juancue.com")
	void WebOfRecord3787() {
		assertEquals("http://www.juancue.com", customers.get(3786).getWeb());
	}
}
