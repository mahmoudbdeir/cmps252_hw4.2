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

@Tag("44")
class Record_3085 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3085: FirstName is Chelsea")
	void FirstNameOfRecord3085() {
		assertEquals("Chelsea", customers.get(3084).getFirstName());
	}

	@Test
	@DisplayName("Record 3085: LastName is Ziebart")
	void LastNameOfRecord3085() {
		assertEquals("Ziebart", customers.get(3084).getLastName());
	}

	@Test
	@DisplayName("Record 3085: Company is Allen, Gail D Esq")
	void CompanyOfRecord3085() {
		assertEquals("Allen, Gail D Esq", customers.get(3084).getCompany());
	}

	@Test
	@DisplayName("Record 3085: Address is 2175 Stone Ave")
	void AddressOfRecord3085() {
		assertEquals("2175 Stone Ave", customers.get(3084).getAddress());
	}

	@Test
	@DisplayName("Record 3085: City is San Jose")
	void CityOfRecord3085() {
		assertEquals("San Jose", customers.get(3084).getCity());
	}

	@Test
	@DisplayName("Record 3085: County is Santa Clara")
	void CountyOfRecord3085() {
		assertEquals("Santa Clara", customers.get(3084).getCounty());
	}

	@Test
	@DisplayName("Record 3085: State is CA")
	void StateOfRecord3085() {
		assertEquals("CA", customers.get(3084).getState());
	}

	@Test
	@DisplayName("Record 3085: ZIP is 95125")
	void ZIPOfRecord3085() {
		assertEquals("95125", customers.get(3084).getZIP());
	}

	@Test
	@DisplayName("Record 3085: Phone is 408-971-9098")
	void PhoneOfRecord3085() {
		assertEquals("408-971-9098", customers.get(3084).getPhone());
	}

	@Test
	@DisplayName("Record 3085: Fax is 408-971-5245")
	void FaxOfRecord3085() {
		assertEquals("408-971-5245", customers.get(3084).getFax());
	}

	@Test
	@DisplayName("Record 3085: Email is chelsea@ziebart.com")
	void EmailOfRecord3085() {
		assertEquals("chelsea@ziebart.com", customers.get(3084).getEmail());
	}

	@Test
	@DisplayName("Record 3085: Web is http://www.chelseaziebart.com")
	void WebOfRecord3085() {
		assertEquals("http://www.chelseaziebart.com", customers.get(3084).getWeb());
	}
}
