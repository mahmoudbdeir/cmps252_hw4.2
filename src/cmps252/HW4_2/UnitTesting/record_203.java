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

@Tag("34")
class Record_203 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 203: FirstName is Humberto")
	void FirstNameOfRecord203() {
		assertEquals("Humberto", customers.get(202).getFirstName());
	}

	@Test
	@DisplayName("Record 203: LastName is Eudy")
	void LastNameOfRecord203() {
		assertEquals("Eudy", customers.get(202).getLastName());
	}

	@Test
	@DisplayName("Record 203: Company is Goettle, Cynthia C Esq")
	void CompanyOfRecord203() {
		assertEquals("Goettle, Cynthia C Esq", customers.get(202).getCompany());
	}

	@Test
	@DisplayName("Record 203: Address is 1501 Gilson St")
	void AddressOfRecord203() {
		assertEquals("1501 Gilson St", customers.get(202).getAddress());
	}

	@Test
	@DisplayName("Record 203: City is Madison")
	void CityOfRecord203() {
		assertEquals("Madison", customers.get(202).getCity());
	}

	@Test
	@DisplayName("Record 203: County is Dane")
	void CountyOfRecord203() {
		assertEquals("Dane", customers.get(202).getCounty());
	}

	@Test
	@DisplayName("Record 203: State is WI")
	void StateOfRecord203() {
		assertEquals("WI", customers.get(202).getState());
	}

	@Test
	@DisplayName("Record 203: ZIP is 53715")
	void ZIPOfRecord203() {
		assertEquals("53715", customers.get(202).getZIP());
	}

	@Test
	@DisplayName("Record 203: Phone is 608-257-7765")
	void PhoneOfRecord203() {
		assertEquals("608-257-7765", customers.get(202).getPhone());
	}

	@Test
	@DisplayName("Record 203: Fax is 608-257-1269")
	void FaxOfRecord203() {
		assertEquals("608-257-1269", customers.get(202).getFax());
	}

	@Test
	@DisplayName("Record 203: Email is humberto@eudy.com")
	void EmailOfRecord203() {
		assertEquals("humberto@eudy.com", customers.get(202).getEmail());
	}

	@Test
	@DisplayName("Record 203: Web is http://www.humbertoeudy.com")
	void WebOfRecord203() {
		assertEquals("http://www.humbertoeudy.com", customers.get(202).getWeb());
	}
}
