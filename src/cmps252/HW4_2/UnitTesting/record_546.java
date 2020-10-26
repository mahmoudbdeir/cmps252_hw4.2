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

@Tag("1")
class Record_546 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 546: FirstName is Madelyne")
	void FirstNameOfRecord546() {
		assertEquals("Madelyne", customers.get(545).getFirstName());
	}

	@Test
	@DisplayName("Record 546: LastName is Kralicek")
	void LastNameOfRecord546() {
		assertEquals("Kralicek", customers.get(545).getLastName());
	}

	@Test
	@DisplayName("Record 546: Company is J E Mclaughlin Distr Sto Engry")
	void CompanyOfRecord546() {
		assertEquals("J E Mclaughlin Distr Sto Engry", customers.get(545).getCompany());
	}

	@Test
	@DisplayName("Record 546: Address is 6202 Mission Gorge Rd")
	void AddressOfRecord546() {
		assertEquals("6202 Mission Gorge Rd", customers.get(545).getAddress());
	}

	@Test
	@DisplayName("Record 546: City is San Diego")
	void CityOfRecord546() {
		assertEquals("San Diego", customers.get(545).getCity());
	}

	@Test
	@DisplayName("Record 546: County is San Diego")
	void CountyOfRecord546() {
		assertEquals("San Diego", customers.get(545).getCounty());
	}

	@Test
	@DisplayName("Record 546: State is CA")
	void StateOfRecord546() {
		assertEquals("CA", customers.get(545).getState());
	}

	@Test
	@DisplayName("Record 546: ZIP is 92120")
	void ZIPOfRecord546() {
		assertEquals("92120", customers.get(545).getZIP());
	}

	@Test
	@DisplayName("Record 546: Phone is 858-284-4630")
	void PhoneOfRecord546() {
		assertEquals("858-284-4630", customers.get(545).getPhone());
	}

	@Test
	@DisplayName("Record 546: Fax is 858-284-0156")
	void FaxOfRecord546() {
		assertEquals("858-284-0156", customers.get(545).getFax());
	}

	@Test
	@DisplayName("Record 546: Email is madelyne@kralicek.com")
	void EmailOfRecord546() {
		assertEquals("madelyne@kralicek.com", customers.get(545).getEmail());
	}

	@Test
	@DisplayName("Record 546: Web is http://www.madelynekralicek.com")
	void WebOfRecord546() {
		assertEquals("http://www.madelynekralicek.com", customers.get(545).getWeb());
	}
}
